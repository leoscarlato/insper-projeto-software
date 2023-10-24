package com.insper.user.user;

import com.insper.user.user.dto.ReturnUserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Service
public class LoginService {

    private HashMap<String, ReturnUserDTO> cache = new HashMap<>();

    public ReturnUserDTO get(String token) {

        ReturnUserDTO user = cache.get(token);
        if (user == null){
            throw new RuntimeException("User not found");
        } else {
            return user;
        }
    }

    public void put(String token, ReturnUserDTO user) {
        cache.put(token, user);
    }

}
