package com.redemaissocial.campanha;

import com.redemaissocial.perfil.Habilidade;
import java.util.ArrayList;
import java.util.List;

public class Vaga {
    private final String id;
    private String descricao;
    private int quantidade;
    private String localizacao;
    private int cargaHorariaSemanal;
    private final List<Habilidade> habilidadesRequeridas = new ArrayList<>();
    private final List<Candidatura> candidaturas = new ArrayList<>();
    private final ListaCandidatos listaCandidatos;

    public Vaga(String id, String descricao, int quantidade, String localizacao, int cargaHoraria) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.localizacao = localizacao;
        this.cargaHorariaSemanal = cargaHoraria;
        this.listaCandidatos = new ListaCandidatos("lista_" + id);
        this.listaCandidatos.setCandidaturas(candidaturas);
    }

    public void abrir() { System.out.println("Vaga aberta: " + descricao); }
    public void fechar() { System.out.println("Vaga fechada."); }

    public String getDescricao() { return descricao; }
    public List<Habilidade> getHabilidadesRequeridas() { return habilidadesRequeridas; }
    public List<Candidatura> getCandidaturas() { return candidaturas; }
    public ListaCandidatos getListaCandidatos() { return listaCandidatos; }
}