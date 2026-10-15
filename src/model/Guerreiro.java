package model;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome, int vida) { super(nome, vida); }

    @Override
    public void atacar() {

        int dano = 30;
        System.out.println(nome  + " ataca com sua espada, causando "  + dano + " de dano!");

    }

}
