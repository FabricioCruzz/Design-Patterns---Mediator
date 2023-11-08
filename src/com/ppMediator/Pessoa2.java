package com.ppMediator;

public class Pessoa2 extends Pessoa{
    
    public Pessoa2(Mediator mediator){
        super(mediator);
    }
    
    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Pessoa 2: Nova mensagem recebida: " + mensagem);
    }
}
