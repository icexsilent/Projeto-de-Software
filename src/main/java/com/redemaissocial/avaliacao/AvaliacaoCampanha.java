package com.redemaissocial.avaliacao;

import java.util.Date;

public class AvaliacaoCampanha {
    private final String id;
    private int nota;
    private String comentario;
    private final Date data = new Date();

    public AvaliacaoCampanha(String id, int nota, String comentario) {
        this.id = id;
        this.nota = nota;
        this.comentario = comentario;
    }

    public void registrar() {
        System.out.println("Avaliação da campanha registrada: " + nota + "/5");
    }
}