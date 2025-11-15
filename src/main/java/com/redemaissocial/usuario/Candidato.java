package com.redemaissocial.usuario;

import com.redemaissocial.campanha.Vaga;
import com.redemaissocial.campanha.Candidatura;
import com.redemaissocial.doacao.Doacao;
import com.redemaissocial.avaliacao.AvaliacaoCampanha;
import com.redemaissocial.recomendacao.Recomendacao;
import com.redemaissocial.entidade.PessoaFisica;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Candidato extends PessoaFisica {
    private final Date dataCadastro = new Date();
    private String situacao = "ATIVO";
    private Perfil perfil;
    private final List<Candidatura> candidaturas = new ArrayList<>();
    private final List<Recomendacao> recomendacoes = new ArrayList<>();
    private final List<Doacao> doacoes = new ArrayList<>();
    private final List<AvaliacaoCampanha> avaliacoesCampanha = new ArrayList<>();

    public Candidato(String id, String nomeCompleto, String email, String telefone,
                     String cpf, String rg, Date dataNascimento) {
        super(id, nomeCompleto, email, telefone, cpf, rg, dataNascimento);
    }

    public void candidatar(Vaga vaga) {
        Candidatura c = new Candidatura(
                "cand_" + (candidaturas.size() + 1),
                new Date(),
                "Quero participar da campanha!",
                "PENDENTE",
                0.0f
        );
        c.setCandidato(this);
        c.setVaga(vaga);
        candidaturas.add(c);
        vaga.getCandidaturas().add(c);
        System.out.println("Candidatura enviada para: " + vaga.getDescricao());
    }

    public void cancelarCandidatura(Vaga vaga) {
        candidaturas.removeIf(c -> c.getVaga().equals(vaga));
        System.out.println("Candidatura cancelada.");
    }

    // Getters
    public Date getDataCadastro() { return dataCadastro; }
    public String getSituacao() { return situacao; }
    public void setSituacao(String situacao) { this.situacao = situacao; }
    public Perfil getPerfil() { return perfil; }
    public void setPerfil(Perfil perfil) { this.perfil = perfil; }
    public List<Candidatura> getCandidaturas() { return candidaturas; }
    public List<Recomendacao> getRecomendacoes() { return recomendacoes; }
    public List<Doacao> getDoacoes() { return doacoes; }
    public List<AvaliacaoCampanha> getAvaliacoesCampanha() { return avaliacoesCampanha; }
}