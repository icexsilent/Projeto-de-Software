package com.redemaissocial.campanha;

import java.util.Date;
import java.util.List;

public class ListaCandidatos {
    private final String id;
    private String criterioOrdenacao = "SCORE";
    private Date dataAtualizacao = new Date();
    private List<Candidatura> candidaturas;

    public ListaCandidatos(String id) {
        this.id = id;
    }

    public void ordenar() {
        System.out.println("Ordenando por " + criterioOrdenacao);
        // candidaturas.sort(...)
    }

    public void setCandidaturas(List<Candidatura> candidaturas) {
        this.candidaturas = candidaturas;
    }
}