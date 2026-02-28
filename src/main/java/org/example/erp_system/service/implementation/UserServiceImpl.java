package org.example.erp_system.service.implementation;

import jakarta.transaction.Transactional;
import org.example.erp_system.dto.UserDTO;
import org.example.erp_system.entity.User;
import org.example.erp_system.repository.UserRepository;
import org.example.erp_system.service.UserService;
import org.example.erp_system.util.VarList;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> users = userRepository.findAll();
        return modelMapper.map(users, new TypeToken<List<UserDTO>>(){}.getType());
    }

    @Override
    public int saveUsers(UserDTO userDTO) {

        if (userRepository.existsByEmail(userDTO.getEmail())) {
            return VarList.Not_Acceptable;
        }

        User user = modelMapper.map(userDTO, User.class);

        // encrypt password
        user.setPassword(new BCryptPasswordEncoder().encode(userDTO.getPassword()));

        userRepository.save(user);

        return VarList.Created;
    }


    @Override
    public void updateUser(UserDTO userDTO) {

    }

    @Override
    public void deleteUser(Integer userId) {

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
