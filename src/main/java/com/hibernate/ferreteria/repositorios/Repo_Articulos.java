package com.hibernate.ferreteria.repositorios;

import com.hibernate.ferreteria.entity.Articulos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo_Articulos extends JpaRepository<Articulos, Long> {
}
