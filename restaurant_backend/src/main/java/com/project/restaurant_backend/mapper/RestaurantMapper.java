package com.project.restaurant_backend.mapper;

import com.project.restaurant_backend.domain.entity.District;
import com.project.restaurant_backend.domain.entity.Restaurant;
import com.project.restaurant_backend.dto.response.DistrictResponseDTO;
import com.project.restaurant_backend.dto.response.RestaurantResponseDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class RestaurantMapper {

    private final ModelMapper modelMapper;

    public RestaurantResponseDTO toResponseDto(Restaurant restaurant) {
        return modelMapper.map(restaurant, RestaurantResponseDTO.class);
    }

    public List<RestaurantResponseDTO> toResponseDtoList(List<Restaurant> restaurants) {
        return restaurants.stream()
                .map(this::toResponseDto)
                .toList();
    }


}
