package com.insper.user.user.dto;

import lombok.Getter;
import lombok.Setter;

import com.insper.user.user.User;
import com.insper.user.user.dto.ReturnUserDTO;

@Getter
@Setter
public class LoginDTO {
    private String email;
    private String password;

    public static ReturnUserDTO convert(User user){
        ReturnUserDTO userDTO = new ReturnUserDTO();
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        userDTO.setRoles(user.getRoles());
        return userDTO;
    }
}
