package com.senai.crudfy.entity;

import jakarta.persistence.*;

@Entity
public class Musica {
    @Id @GeneratedValue
    @Column(length = 100, unique = true)
    private int id;
    private String titulo;
    private String artista;
    private String album;
    private Genero genero;
    private String duracao;
    private String capa;

    private Musica(){

    }
    public Musica(int id, String titulo, String artista, Genero genero, String album, String duracao, String capa) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.album = album;
        this.duracao = duracao;
        this.capa = capa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }
}
