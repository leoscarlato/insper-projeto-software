package main.java.com.insper.partida.common.game;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.insper.partida.common.game.dto.ReturnUserDTO;

@Service
public class PartidaService {

    public void validarUsuario(String token){

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<ReturnUserDTO> response = restTemplate.getForEntity("http://localhost:8080/login/token/"+token, ReturnUserDTO.class);

        if(!response.getStatusCode().is2xxSuccessful()){
            throw new RuntimeException("User not found");
        }

    }
}

