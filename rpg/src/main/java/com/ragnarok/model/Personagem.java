package com.ragnarok.model;

public class Personagem {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    
    public String getNome() {
        return nome;
    }
    
    public int getVida() {
        return vida;
    }
    
    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public int setVida(int vida) {
        this.vida = vida;
        return vida;
    }

    public int setAtaque(int ataque) {
        this.ataque = ataque;
        return ataque;
    }

    public int setDefesa(int defesa) {
        this.defesa = defesa;
        return defesa;
    }
    

    public void receberDano(int dano){
        int danoFinal = Math.max(0, dano - defesa);
        if (danoFinal <= 0) {
            System.out.println(nome + " bloqueou o ataque!");
        }
        else{
            vida -= danoFinal;
            System.out.println(nome + " recebeu " + danoFinal + " de dano!");
             if (vida <= 0) {
                vida = 0;
                System.out.println(nome + " foi derrotado!");
            }
        }
    }


    public void atacar(Personagem alvo){
        System.out.println(getNome() + " atacou!");
        alvo.receberDano(getAtaque());
    }

    public void defender(){
        System.out.println(getNome() + "está defendendo!");
        setDefesa(getDefesa());
    }

    public void agir(Personagem alvo, int escolha){};

    public String[] getAcoes(){
        return new String[] {"Atacar", "Defender"};
    }
}