package model;

public class Arqueiro extends Personagem {

    public Arqueiro(String nome, int vida) { super(nome, vida); }

    @Override
    public void atacar() {

        int dano = 20;
        System.out.println(nome  + " dispara uma flecha, causando "  + dano + " de dano!");

    }

}
