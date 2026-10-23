package com.senai.crudfy.Service;

import com.senai.crudfy.entity.Musica;
import com.senai.crudfy.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArtistaService {
    @Autowired
    MusicaRepository ArtistaRepository;

    public List<Musica> mostrarArtistas() {
        List<Musica> lista = new ArrayList<>();
        lista = ArtistaRepository.findAll();
        return lista;
    }

}


