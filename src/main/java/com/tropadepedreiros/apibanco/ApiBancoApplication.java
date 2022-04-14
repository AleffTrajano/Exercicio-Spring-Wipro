package com.tropadepedreiros.apibanco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tropadepedreiros.apibanco.model.Usuario;

@SpringBootApplication
public class ApiBancoApplication {

	private static final String UsuarioRepository = null;
	public static void main(String[] args) {
		SpringApplication.run(ApiBancoApplication.class, args);
	}
            Usuario marcelo = new Usuario("Marcelo Carvalho","marcelo@gmail.com","123","car", "nun");
            Usuario libia = new Usuario("Líbia Bráz","li@gmail.com","123","bra","nun");
            Usuario joao = new Usuario("João Carvalho","joao@gmail.com","151","fsdf","nun" );
            Usuario cleunice = new Usuario("Cleunice Carvalho","Cleo@gmail.com","555","dsfsd","nun");
           
    
}


