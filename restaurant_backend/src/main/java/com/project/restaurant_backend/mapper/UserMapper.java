package com.project.restaurant_backend.mapper;

import com.project.restaurant_backend.domain.entity.User;
import com.project.restaurant_backend.dto.request.SignupRequestDTO;
import com.project.restaurant_backend.dto.response.AuthResponseDTO;
import com.project.restaurant_backend.dto.response.UserProfileResponseDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class UserMapper {

  private final ModelMapper modelMapper;

  public User toUser(SignupRequestDTO signupRequestDTO) {
    return modelMapper.map(signupRequestDTO, User.class);
  }

  public UserProfileResponseDTO toUserProfileResponseDTO(User user) {
    return modelMapper.map(user, UserProfileResponseDTO.class);
  }

  public AuthResponseDTO toAuthResponseDTO(String token, UserProfileResponseDTO userProfile) {
    AuthResponseDTO authResponseDTO = new AuthResponseDTO();
    authResponseDTO.setToken(token);
    authResponseDTO.setUser(userProfile);
    return authResponseDTO;
  }
}
