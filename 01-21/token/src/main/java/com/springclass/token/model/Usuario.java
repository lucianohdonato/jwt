package com.springclass.token.model;

public class Usuario {
	private int id;
	private String username;
	private String password;
	private String nome;
	private String email;
	
	public Usuario(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public Usuario() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
