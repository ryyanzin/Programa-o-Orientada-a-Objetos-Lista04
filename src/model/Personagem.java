package model;

public abstract class Personagem {

    protected String nome;
    protected int vida;

    public Personagem(String nome, int vida) {

        this.nome = nome;
        this.vida = vida;

    }

    public abstract void atacar();
}
