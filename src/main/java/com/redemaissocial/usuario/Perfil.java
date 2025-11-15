package com.redemaissocial.usuario;

import com.redemaissocial.perfil.Habilidade;
import com.redemaissocial.perfil.Interesse;
import java.util.ArrayList;
import java.util.List;

public class Perfil {
    private String descricaoPessoal;
    private int raioBuscaKm;
    private final List<Habilidade> habilidades = new ArrayList<>();
    private final List<Interesse> interesses = new ArrayList<>();

    public void atualizarDescricao(String novaDescricao) {
        this.descricaoPessoal = novaDescricao;
    }

    public String getDescricaoPessoal() { return descricaoPessoal; }
    public int getRaioBuscaKm() { return raioBuscaKm; }
    public void setRaioBuscaKm(int raioBuscaKm) { this.raioBuscaKm = raioBuscaKm; }
    public List<Habilidade> getHabilidades() { return habilidades; }
    public List<Interesse> getInteresses() { return interesses; }
}