package com.redemaissocial.campanha;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Campanha {
    private final String id;
    private String titulo;
    private String descricao;
    private String causa;
    private final Date dataInicio = new Date();
    private Date dataFim;
    private String status = "PLANEJADA";
    private final List<Vaga> vagas = new ArrayList<>();

    public Campanha(String id, String titulo, String descricao, String causa) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.causa = causa;
    }

    public void ativar() { this.status = "ATIVA"; }
    public void encerrar() { this.status = "ENCERRADA"; }

    public String getId() { return id; }
    public String getTitulo() { return titulo; }
    public List<Vaga> getVagas() { return vagas; }
}