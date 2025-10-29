package com.hibernate.ferreteria.controladores;

import com.hibernate.ferreteria.DTOs.ArticulosDTO;
import com.hibernate.ferreteria.entity.Articulos;
import com.hibernate.ferreteria.mapper.ArticuloMapper;
import com.hibernate.ferreteria.repositorios.Repo_Articulos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/articulos")
public class ArticuloController {

    @Autowired
    private Repo_Articulos repositorio;

    @GetMapping("")
    public List<ArticulosDTO> Consulta(){
        //return (List<Articulos>) repositorio.findAll();
        return repositorio.findAll().stream().map(ArticuloMapper::toDTO).collect(Collectors.toList());
    }

}
