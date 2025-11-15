package com.redemaissocial.recomendacao;

import java.util.Date;

public class Recomendacao {
    private final Date dataRecomendacao = new Date();
    private String status = "GERADA";
    private int percentualRecomendacao;

    public void gerar() {
        System.out.println("Recomendação gerada: " + percentualRecomendacao + "%");
    }

    public void setPercentualRecomendacao(int percentual) {
        this.percentualRecomendacao = percentual;
    }
}