package com.redemaissocial.entidade;

public abstract class Entidade {
    private String id;
    private String nomeCompleto;
    private String email;
    private String telefone;

    public Entidade(String id, String nomeCompleto, String email, String telefone) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
    }

    public void getDados() {
        System.out.println("ID: " + id + ", Nome: " + nomeCompleto + ", Email: " + email);
    }

    public void atualizarContato(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    // Getters & Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = nomeCompleto; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}