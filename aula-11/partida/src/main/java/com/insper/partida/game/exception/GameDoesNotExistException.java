package com.insper.partida.game.exception;

public class GameDoesNotExistException extends RuntimeException{

    public GameDoesNotExistException()
        { super("O jogo não existe");}
}
