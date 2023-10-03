package com.insper.partida.equipe.exception;

public class SameTeamException extends RuntimeException{

    public SameTeamException() {
        super("Os times devem ser diferentes!");
    }

}
