package com.redemaissocial;

import com.redemaissocial.usuario.*;
import com.redemaissocial.campanha.*;
import com.redemaissocial.perfil.*;
import com.redemaissocial.entidade.PessoaFisica;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("REDE MAIS SOCIAL - INICIADO EM 15/11/2025 19:44");
        System.out.println("=".repeat(50));

        // 1. Criar um Candidato
        Candidato joao = new Candidato(
            "CAND001", "João Pereira", "joao@email.com", "11987654321",
            "12345678900", "9876543", new Date(1995, 5, 20)
        );

        // 2. Criar Perfil do Candidato
        Perfil perfilJoao = new Perfil();
        perfilJoao.getHabilidades().add(new Habilidade("Cozinhar"));
        perfilJoao.getHabilidades().add(new Habilidade("Organização"));
        perfilJoao.setRaioBuscaKm(30);
        joao.setPerfil(perfilJoao);

        // 3. Criar uma ONG
        ONG ongAmor = new ONG(
            "ONG001", "ONG Amor ao Próximo", "contato@ongamor.org", "1133334444",
            "12345678000199", "Amor ao Próximo LTDA", "Ajudar famílias carentes", "www.ongamor.org"
        );

        // 4. Criar uma Campanha
        Campanha sopaSolidaria = new Campanha("CAMP001", "Sopa Solidária", 
            "Distribuir sopa para pessoas em situação de rua", "Alimentação");

        // 5. Criar uma Vaga na Campanha
        Vaga vagaCozinha = new Vaga("VAGA001", "Voluntário na Cozinha", 5, "São Paulo - Centro", 4);
        sopaSolidaria.getVagas().add(vagaCozinha);

        // 6. ONG cria a campanha
        ongAmor.criarCampanha(sopaSolidaria);

        // 7. João se candidata à vaga
        joao.candidatar(vagaCozinha);

        // 8. Mostrar dados
        System.out.println("\nDADOS DO CANDIDATO:");
        joao.getDados();
        System.out.println("Habilidades: " + 
            joao.getPerfil().getHabilidades().stream()
                .map(Habilidade::getDescricao).toList());

        System.out.println("\nSISTEMA FINALIZADO COM SUCESSO!");
    }
}