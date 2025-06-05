package com.project.restaurant_backend.dto.response;

import com.project.restaurant_backend.domain.enums.Role;
import lombok.Data;

@Data
public class UserProfileResponseDTO {
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private Role role;
}
