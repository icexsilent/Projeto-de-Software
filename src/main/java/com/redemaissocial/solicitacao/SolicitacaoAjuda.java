package com.redemaissocial.solicitacao;

import java.util.Date;

public class SolicitacaoAjuda {
    private final String id;
    private String descricao;
    private String urgencia;
    private final Date dataSolicitacao = new Date();
    private String statusSolicitacao = "ABERTA";

    public SolicitacaoAjuda(String id, String descricao, String urgencia) {
        this.id = id;
        this.descricao = descricao;
        this.urgencia = urgencia;
    }

    public void registrar() { System.out.println("Solicitação registrada: " + descricao); }
    public void fechar() { this.statusSolicitacao = "FECHADA"; }
}