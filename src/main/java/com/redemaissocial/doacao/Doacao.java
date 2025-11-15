package com.redemaissocial.doacao;

import java.util.Date;

public class Doacao {
    private final String id;
    private String tipo; // "FINANCEIRA" ou "ITENS"
    private float valor;
    private String descricaoItens;
    private final Date data = new Date();
    private String status = "PENDENTE";

    public Doacao(String id, String tipo, float valor, String descricaoItens) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.descricaoItens = descricaoItens;
    }

    public void registrar() { System.out.println("Doação registrada: " + tipo); }
    public void confirmar() { this.status = "CONFIRMADA"; }
}