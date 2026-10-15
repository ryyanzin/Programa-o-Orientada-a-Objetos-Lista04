package model;

public class Mago extends Personagem {

    public Mago(String nome, int vida) { super(nome, vida); }

    @Override
    public void atacar() {

        int dano = 40;
        System.out.println(nome  + " lança uma bola de fogo, causando "  + dano + " de dano mágico!");

    }

}
