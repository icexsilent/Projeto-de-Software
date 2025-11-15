package com.redemaissocial.usuario;

import com.redemaissocial.campanha.Campanha;
import com.redemaissocial.doacao.Doacao;
import com.redemaissocial.solicitacao.SolicitacaoAjuda;
import com.redemaissocial.avaliacao.AvaliacaoVoluntario;
import com.redemaissocial.entidade.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;

public class ONG extends PessoaJuridica {
    private String missao;
    private String site;
    private final List<Campanha> campanhas = new ArrayList<>();
    private final List<Doacao> doacoesRecebidas = new ArrayList<>();
    private final List<SolicitacaoAjuda> solicitacoesAtendidas = new ArrayList<>();
    private final List<AvaliacaoVoluntario> avaliacoesVoluntarios = new ArrayList<>();

    public ONG(String id, String nomeCompleto, String email, String telefone,
               String cnpj, String razaoSocial, String missao, String site) {
        super(id, nomeCompleto, email, telefone, cnpj, razaoSocial, "");
        this.missao = missao;
        this.site = site;
    }

    public void criarCampanha(Campanha c) {
        campanhas.add(c);
        System.out.println("Campanha criada: " + c.getTitulo());
    }

    public void aprovarCandidatos() {
        System.out.println("Aprovando candidatos...");
    }

    public List<Campanha> getCampanhas() { return campanhas; }
    public List<Doacao> getDoacoesRecebidas() { return doacoesRecebidas; }
    public List<SolicitacaoAjuda> getSolicitacoesAtendidas() { return solicitacoesAtendidas; }
}