package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;
//pra dizer quew essa calasse é implementada por um controlador rest, precisa desse controlador
@RestController
@RequestMapping(value = "/users") // nome do recurso, com o caminho do meu recurso
public class UserResource {
	
	//criando o metodo que sera o endpoint para acessar os usuarios, user é o nome da minha classe
	//indicando qu esse metodo é um metoddo que responde a reequisiçaõ do tipo get do http
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u  = new User(1L, "Maria", "maria@hotmail", "35361502", "1234");
		return ResponseEntity.ok().body(u); // retorna ok no http, e retorna o corpo da resposta	
	}
}
