package com.ragnarok.model;

public class Guerreiro extends Personagem {
    private int forca;

    public Guerreiro(String nome, int vida, int ataque, int defesa, int forca){
        super(nome, vida, ataque, defesa);
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }

    @Override
    public void atacar(Personagem alvo){
        System.out.println(getNome() + " atacou!");
        alvo.receberDano(getAtaque() + forca);
    }

    @Override
    public void defender(){
        System.out.println(getNome() + "está defendendo!");
        setDefesa(getDefesa() + 10);
    }

    @Override
    public void agir(Personagem alvo, int escolha) {
        switch(escolha){
            case 1:
                atacar(alvo);
                break;
            case 2:
                defender();
                break;
        }
    }

    @Override
    public String[] getAcoes(){
        return new String[] {"Atacar", "Defender"};
    }
    
}
