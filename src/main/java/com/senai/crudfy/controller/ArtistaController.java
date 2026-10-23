package com.senai.crudfy.controller;

import com.senai.crudfy.Service.ArtistaService;
import com.senai.crudfy.entity.Musica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
    @RestController
    @RequestMapping("Artistas")
    public class ArtistaController{

        @Autowired
        ArtistaService artistaService;

        @GetMapping
        public List<Musica> mostrar(){
            return artistaService.mostrarArtistas();
        }


    }

