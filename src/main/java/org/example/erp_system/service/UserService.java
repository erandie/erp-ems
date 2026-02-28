package org.example.erp_system.service;

import org.example.erp_system.dto.UserDTO;
import org.example.erp_system.entity.User;
import org.example.erp_system.repository.UserRepository;
//import org.example.erp_system.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    List<UserDTO> getAllUsers();

    int saveUsers(UserDTO userDTO);

    void updateUser(UserDTO userDTO);

    void deleteUser(Integer userId);

}
