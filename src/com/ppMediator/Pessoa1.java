package com.ppMediator;

public class Pessoa1 extends Pessoa{
    
    public Pessoa1(Mediator mediator){
        super(mediator);
    }
    
    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Pessoa 1: Nova mensagem recebida: " + mensagem);
    }
}
