package main.java.com.insper.partida.common.game.dto;

import lombok.*;
import java.util.List;


@Getter
@Setter
public class ReturnUserDTO {

    private String email;
    private String password;
    private List<String> roles;

}
