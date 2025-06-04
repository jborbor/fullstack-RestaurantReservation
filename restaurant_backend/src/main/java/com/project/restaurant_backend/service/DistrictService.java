package com.project.restaurant_backend.service;

import com.project.restaurant_backend.domain.entity.District;
import com.project.restaurant_backend.dto.response.DistrictResponseDTO;
import com.project.restaurant_backend.mapper.DistrictMapper;
import com.project.restaurant_backend.repository.DistrictRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DistrictService {
    private final DistrictRepository districtRepository;
    private final DistrictMapper districtMapper;

    @Transactional(readOnly = true)
    public List<DistrictResponseDTO> getAllDistricts() {
        List<District> districts = districtRepository.findAll();
        return districtMapper.toResponseDtoList(districts);
    }

}
