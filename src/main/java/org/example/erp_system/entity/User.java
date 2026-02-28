package org.example.erp_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String userName;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String email;
    private String password;



//    private List<String> permission = new ArrayList<>();

//    public void login(String userName, String password){
//
//    }
//
//    public void logout(){
//
//    }
//
//    public boolean hasPermission(String permission){
//        return true;
//    }

}

