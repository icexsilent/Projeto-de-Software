package com.redemaissocial.campanha;

import java.util.Date;

public class HistoricoCandidatura {
    private final String id;
    private final Date data;
    private final String statusAnterior;
    private final String statusAtual;
    private final String observacao;

    public HistoricoCandidatura(String id, Date data, String anterior, String atual, String obs) {
        this.id = id;
        this.data = data;
        this.statusAnterior = anterior;
        this.statusAtual = atual;
        this.observacao = obs;
    }

    public void registrarMudanca() {
        System.out.println("Mudança: " + statusAnterior + " → " + statusAtual);
    }
}