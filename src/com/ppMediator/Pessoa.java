package com.ppMediator;

public abstract class Pessoa {
    protected Mediator mediator;

    public Pessoa(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void receberMensagem(String mensagem);
}
