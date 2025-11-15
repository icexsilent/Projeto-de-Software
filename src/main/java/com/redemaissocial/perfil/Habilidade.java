package com.redemaissocial.perfil;

public class Habilidade {
    private String descricao;

    public Habilidade(String descricao) {
        this.descricao = descricao;
    }

    public void cadastrar() {
        System.out.println("Habilidade cadastrada: " + descricao);
    }

    public String getDescricao() { return descricao; }
}