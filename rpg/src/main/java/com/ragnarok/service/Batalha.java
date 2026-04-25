package com.ragnarok.service;

import com.ragnarok.model.*;
import java.util.Scanner;

public class Batalha {
    
    public static void iniciarBatalha(Personagem p1, Personagem p2){
        Scanner sc = new Scanner(System.in);

        Personagem[] jogadores = {p1, p2};
        int turnoAtual = (int)(Math.random() * jogadores.length);

        System.out.println("A batalha começou!");

        while (p1.getVida() > 0 && p2.getVida() > 0){
            // Escolha da ação
            System.out.println("Turno de " + jogadores[turnoAtual].getNome() + "!");
            
            String[] acoes = jogadores[turnoAtual].getAcoes();

            for(int i =0; i < acoes.length; i++){
                System.out.println((i + 1) + " - " + acoes[i]);
            }

            int escolha;
            do {
                escolha = sc.nextInt();
            } while (escolha < 1 || escolha > acoes.length);

            // Escolha do alvo
            System.out.println("Escolha quem será o alvo:");
            for (int i = 0; i < jogadores.length; i++) {
                if (i != turnoAtual) {
                    System.out.println((i + 1) + " - " + jogadores[i].getNome());
                }
            }
            
            int alvoEscolhido;
            do {
                alvoEscolhido = sc.nextInt() - 1;
            } while (alvoEscolhido == turnoAtual || alvoEscolhido < 0 || alvoEscolhido >= jogadores.length);    

            System.out.println(jogadores[alvoEscolhido].getNome() + " foi escolhido como alvo!");

            jogadores[turnoAtual].agir(jogadores[alvoEscolhido - 1], escolha); // Exemplo de escolha (pode ser randomizada)

            // Controlador de turno
            turnoAtual = (turnoAtual + 1) % jogadores.length;

        }
    }

}
