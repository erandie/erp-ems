package org.example.erp_system.controller;

import org.example.erp_system.dto.UserDTO;
import org.example.erp_system.service.implementation.UserServiceImpl;
import org.example.erp_system.util.ResponseUtil;
import org.example.erp_system.util.VarList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin
@Validated
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/get")
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

//    @GetMapping("/get/{userId}")
//    public UserDTO getUserById(@PathVariable int userId) {
//        return userService.getUserById(userId);
//    }


    @PostMapping("/save")
    public ResponseEntity<ResponseUtil> saveUsers(@RequestBody UserDTO userDTO) {

        int res = userService.saveUsers(userDTO);

        if (res == VarList.Created) {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(new ResponseUtil(201, "User saved successfully", null));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE)
                    .body(new ResponseUtil(406, "Email already exists", null));
        }
    }


}
