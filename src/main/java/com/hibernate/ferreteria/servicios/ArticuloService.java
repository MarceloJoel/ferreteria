package com.hibernate.ferreteria.servicios;

import com.hibernate.ferreteria.DTOs.ArticulosDTO;
import com.hibernate.ferreteria.entity.Articulos;
import com.hibernate.ferreteria.mapper.ArticuloMapper;
import com.hibernate.ferreteria.repositorios.Repo_Articulos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ArticuloService {

    @Autowired
    private Repo_Articulos repo;

    public List<ArticulosDTO> serv_consulta() {
        //return (List<Articulos>) repositorio.findAll();
        return repo.findAll().stream().map(ArticuloMapper::toDTO).collect(Collectors.toList());
    }

    public ArticulosDTO serv_inserta(ArticulosDTO dto) {
        Articulos articulo = ArticuloMapper.toEntity(dto);
        Articulos insertado = repo.save(articulo);
        return ArticuloMapper.toDTO(insertado);
    }

    public ArticulosDTO serv_actualiza(Long id, ArticulosDTO dto) {
        Optional<Articulos> existe = repo.findById(id);

        if (existe.isPresent()) {
            Articulos articulo = existe.get();
            articulo.setNombrearticulo(dto.getNombrearticulo());
            articulo.setPrecio(dto.getPrecio());
            articulo.setExistencia(dto.getExistencia());

            Articulos actualizado = repo.save(articulo);

            return ArticuloMapper.toDTO(actualizado);
        } else {
            throw new RuntimeException("Articulo no encontrado con id: " + id);
        }
    }

    public String eliminaArticulos(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Articulo eliminado con id: " + id;
        } else {
            return "Articulo: " + id + " no encontrado";
        }
    }
}
