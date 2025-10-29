package com.hibernate.ferreteria.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "articulos")
@Data               //Genera automaticamente los getters and setters
@NoArgsConstructor  //Genera un constructor vacio
@AllArgsConstructor //Genera un constructor con todos los campos

public class Articulos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //Genera automaticamente los ids

    @Column(name = "id")
    private int id;

    @Column(name = "nombrearticulo")
    private String nombrearticulo;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "existencia")
    private Integer existencia;


}
