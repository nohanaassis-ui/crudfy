package com.senai.crudfy.entity;

public class Artista {

    private int id;
    private String nome;
    private String generomusical;
    private String nacionalidade;

    public Artista(){

    }
    public Artista(int id, String nome, String generomusical, String nacionalidade) {
        this.id = id;
        this.nome = nome;
        this.generomusical = generomusical;
        this.nacionalidade = nacionalidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGeneromusical() {
        return generomusical;
    }

    public void setGeneromusical(String generomusical) {
        this.generomusical = generomusical;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}
