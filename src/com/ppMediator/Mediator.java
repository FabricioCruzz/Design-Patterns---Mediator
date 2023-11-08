package com.ppMediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<Pessoa> pessoas;

    public Mediator(){
        pessoas = new ArrayList<>();
    }

    public void addPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public void enviarMensagem(Pessoa pessoa, String mensagem){
        for (Pessoa p : pessoas) {
            if(p != pessoa){
                p.receberMensagem(mensagem);
            }
        }
    }
}
