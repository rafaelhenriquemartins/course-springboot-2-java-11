package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.services.OrderService;
//pra dizer quew essa calasse é implementada por um controlador rest, precisa desse controlador
@RestController
@RequestMapping(value = "/orders") // nome do recurso, com o caminho do meu recurso
public class OrderResource {
	
	//criando o metodo que sera o endpoint para acessar os usuarios, user é o nome da minha classe
	//indicando qu esse metodo é um metoddo que responde a reequisiçaõ do tipo get do http
	
	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity <List<Order>> findAll(){
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list); // retorna ok no http, e retorna o corpo da resposta	
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
	
	
}
