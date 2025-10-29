package com.hibernate.ferreteria.servicios;

import com.hibernate.ferreteria.DTOs.ArticulosDTO;
import com.hibernate.ferreteria.mapper.ArticuloMapper;
import com.hibernate.ferreteria.repositorios.Repo_Articulos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArticuloService {

    @Autowired
    private Repo_Articulos repo;

    public List<ArticulosDTO> Consulta(){
        //return (List<Articulos>) repositorio.findAll();
        return repo.findAll().stream().map(ArticuloMapper::toDTO).collect(Collectors.toList());
    }


}
