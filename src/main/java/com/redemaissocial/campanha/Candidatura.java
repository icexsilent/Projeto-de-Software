package com.redemaissocial.campanha;

import com.redemaissocial.usuario.Candidato;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Candidatura {
    private final String id;
    private final Date data;
    private String mensagem;
    private String status;
    private float scoreAdequacao;
    private Candidato candidato;
    private Vaga vaga;
    private final List<HistoricoCandidatura> historico = new ArrayList<>();

    public Candidatura(String id, Date data, String mensagem, String status, float score) {
        this.id = id;
        this.data = data;
        this.mensagem = mensagem;
        this.status = status;
        this.scoreAdequacao = score;
    }

    public void aprovar() {
        registrarMudanca(status, "APROVADA", "Candidato aprovado");
        this.status = "APROVADA";
    }

    public void recusar() {
        registrarMudanca(status, "RECUSADA", "Não atende requisitos");
        this.status = "RECUSADA";
    }

    public void cancelar() {
        registrarMudanca(status, "CANCELADA", "Cancelada pelo candidato");
        this.status = "CANCELADA";
    }

    private void registrarMudanca(String anterior, String atual, String obs) {
        HistoricoCandidatura h = new HistoricoCandidatura(
                "hist_" + historico.size(), new Date(), anterior, atual, obs);
        historico.add(h);
    }

    // Getters & Setters
    public void setCandidato(Candidato candidato) { this.candidato = candidato; }
    public void setVaga(Vaga vaga) { this.vaga = vaga; }
    public Vaga getVaga() { return vaga; }
    public List<HistoricoCandidatura> getHistorico() { return historico; }
}