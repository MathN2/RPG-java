package com.ragnarok.model;

public class Mago extends Personagem {
    private int mana;

    public Mago(String nome, int vida, int ataque, int defesa, int mana){
        super(nome, vida, ataque, defesa);
        this.mana = mana;
    }
    

    public int getMana() {
        return mana;
    }

    public void lancarMagia(Personagem alvo){
        if (mana >= 10){
            System.out.println(getNome() + " lançou uma magia!");
            alvo.receberDano(getAtaque() + 15);
            mana -= 10;
        }
    }

    public void regenerarMana(){
        System.out.println(getNome() + " está regenerando mana!");
        mana += 5;
    }

    public void curar(Personagem alvo){
        System.out.println(getNome() + " está curando " + alvo.getNome() + "!");
        alvo.setVida(alvo.getVida() + 15);
    }


    @Override
    public void agir(Personagem alvo, int escolha) {
        switch(escolha){
            case 1:
                lancarMagia(alvo);
                break;
            case 2:
                curar(alvo);
                break;
        }
    }

    @Override
    public String[] getAcoes(){
        return new String[]{"Lançar Magia", "Curar"};
    }
}
