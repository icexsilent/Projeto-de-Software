package com.redemaissocial.entidade;

public class PessoaJuridica extends Entidade {
    private String cnpj;
    private String razaoSocial;
    private String inscricaoEstadual;

    public PessoaJuridica(String id, String nomeCompleto, String email, String telefone,
                          String cnpj, String razaoSocial, String inscricaoEstadual) {
        super(id, nomeCompleto, email, telefone);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public void validarCNPJ() {
        if (cnpj != null && cnpj.matches("\\d{14}")) {
            System.out.println("CNPJ válido: " + cnpj);
        } else {
            System.out.println("CNPJ inválido!");
        }
    }

    public String getCnpj() { return cnpj; }
    public String getRazaoSocial() { return razaoSocial; }
}