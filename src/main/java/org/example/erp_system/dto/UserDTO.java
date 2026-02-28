package org.example.erp_system.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.erp_system.entity.Role;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {

    private Integer userId;
    private String userName;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String email;
    private String password;


}
