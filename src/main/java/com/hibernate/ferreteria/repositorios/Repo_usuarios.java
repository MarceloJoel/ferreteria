package com.hibernate.ferreteria.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.ferreteria.entity.Usuario;

public interface Repo_usuarios extends JpaRepository<Usuario, Long>{
    Optional<Usuario>findByUsername(String usuario);
}
