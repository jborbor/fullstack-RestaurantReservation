package com.project.restaurant_backend.service;

import com.project.restaurant_backend.domain.entity.Restaurant;
import com.project.restaurant_backend.dto.response.RestaurantResponseDTO;
import com.project.restaurant_backend.exception.ResourceNotFoundException;
import com.project.restaurant_backend.mapper.RestaurantMapper;
import com.project.restaurant_backend.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;
    private final RestaurantMapper restaurantMapper;

    @Transactional(readOnly = true)
    public Page<RestaurantResponseDTO> getAllRestaurants(Pageable pageable) {
        Page<Restaurant> restaurants = restaurantRepository.findAll(pageable);
        return restaurants.map(restaurantMapper::toResponseDto);
    }

    @Transactional(readOnly = true)
    public Page<RestaurantResponseDTO> findByDistrictName(String districtName, Pageable pageable) {
        Page<Restaurant> restaurants = restaurantRepository.findByDistrictName(districtName, pageable);
        return restaurants.map(restaurantMapper::toResponseDto);
    }

    @Transactional(readOnly = true)
    public RestaurantResponseDTO getRestaurantById(Long id) {
        Restaurant restaurant = restaurantRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Restaurant not found with id: " + id));
        return restaurantMapper.toResponseDto(restaurant);
    }

}
