package com.tropadepedreiros.apibanco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tropadepedreiros.apibanco.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
