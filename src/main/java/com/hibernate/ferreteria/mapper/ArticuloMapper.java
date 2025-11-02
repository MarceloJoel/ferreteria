package com.hibernate.ferreteria.mapper;

import com.hibernate.ferreteria.DTOs.ArticulosDTO;
import com.hibernate.ferreteria.entity.Articulos;

public class ArticuloMapper {
    public static ArticulosDTO toDTO(Articulos articulo) {
        return new ArticulosDTO(
                articulo.getId(),
                articulo.getNombrearticulo(),
                articulo.getPrecio(),
                articulo.getExistencia()
        );
    }

    public static Articulos toEntity(ArticulosDTO dto) {
        Articulos articulos = new Articulos();
        articulos.setId(dto.getId());
        articulos.setNombrearticulo(dto.getNombrearticulo());
        articulos.setPrecio(dto.getPrecio());
        articulos.setExistencia(dto.getExistencia());
        return articulos;
    }
}
