package com.redemaissocial.entidade;

import java.util.Date;

public class PessoaFisica extends Entidade {
    private String cpf;
    private String rg;
    private Date dataNascimento;

    public PessoaFisica(String id, String nomeCompleto, String email, String telefone,
                        String cpf, String rg, Date dataNascimento) {
        super(id, nomeCompleto, email, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    public void validarDocumento() {
        if (cpf != null && cpf.matches("\\d{11}")) {
            System.out.println("CPF válido: " + cpf);
        } else {
            System.out.println("CPF inválido!");
        }
    }

    public String getCpf() { return cpf; }
    public String getRg() { return rg; }
    public Date getDataNascimento() { return dataNascimento; }
}