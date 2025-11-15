package com.redemaissocial.usuario;

import com.redemaissocial.solicitacao.SolicitacaoAjuda;
import com.redemaissocial.entidade.PessoaFisica;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Beneficiario extends PessoaFisica {
    private String situacaoSocial;
    private final List<SolicitacaoAjuda> solicitacoes = new ArrayList<>();

    public Beneficiario(String id, String nomeCompleto, String email, String telefone,
                        String cpf, String rg, Date dataNascimento, String situacaoSocial) {
        super(id, nomeCompleto, email, telefone, cpf, rg, dataNascimento);
        this.situacaoSocial = situacaoSocial;
    }

    public void atualizarCadastro() {
        System.out.println("Cadastro atualizado: " + situacaoSocial);
    }

    public List<SolicitacaoAjuda> getSolicitacoes() { return solicitacoes; }
    public String getSituacaoSocial() { return situacaoSocial; }
}