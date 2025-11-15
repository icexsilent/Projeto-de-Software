package com.redemaissocial.perfil;

public class Interesse {
    private String descricao;

    public Interesse(String descricao) {
        this.descricao = descricao;
    }

    public void definir() {
        System.out.println("Interesse definido: " + descricao);
    }

    public String getDescricao() { return descricao; }
}