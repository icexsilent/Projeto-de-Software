package com.redemaissocial.avaliacao;

import java.util.Date;

public class AvaliacaoVoluntario {
    private final String id;
    private int nota;
    private String comentario;
    private final Date data = new Date();

    public AvaliacaoVoluntario(String id, int nota, String comentario) {
        this.id = id;
        this.nota = nota;
        this.comentario = comentario;
    }

    public void registrar() {
        System.out.println("Avaliação do voluntário registrada: " + nota + "/5");
    }
}