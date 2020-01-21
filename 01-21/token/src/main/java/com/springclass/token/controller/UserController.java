package com.springclass.token.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springclass.token.baseDados.BaseDadosProdutos;
import com.springclass.token.baseDados.BaseDadosUsuarios;
import com.springclass.token.model.Produto;
import com.springclass.token.model.Token;
import com.springclass.token.model.Usuario;
import com.springclass.token.util.Autenticator;


@CrossOrigin("*")
@RestController
public class UserController {
	@PostMapping("/autenticate")
	public ResponseEntity<Token> autenticate(@RequestBody Usuario usuario) {
		System.out.println(usuario.getUsername());
		System.out.println(usuario.getPassword());
		BaseDadosUsuarios usuarios = new BaseDadosUsuarios();
		for (Usuario item : usuarios.getListaUsuario()) {
			if (usuario.getUsername().equals(item.getUsername()) && usuario.getPassword().equals(item.getPassword())) {
				System.out.println(Autenticator.encode(usuario));
				return ResponseEntity.ok(new Token(Autenticator.encode(usuario)));
			}
		}
		return ResponseEntity.status(403).build();
	}
	
	@GetMapping("/produtos/all")
	public ResponseEntity<List<Produto>> getProdutos(@RequestParam String token) {
		try {
			if (Autenticator.isValid(token)) {
				BaseDadosProdutos lista = new BaseDadosProdutos();
				return ResponseEntity.ok(lista.getListaProdutos());
			}
			return ResponseEntity.status(403).build();
		} catch (Exception ex) {
			return ResponseEntity.status(400).build();
		}
	}
}

