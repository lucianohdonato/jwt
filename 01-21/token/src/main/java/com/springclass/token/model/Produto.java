package com.springclass.token.model;

public class Produto {
	private int id;
	private String nome;
	private double valor; 
	private int codigoBarras;
	
	public Produto(int id, String nome, double valor, int codigoBarras) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.codigoBarras = codigoBarras;
	}
	public Produto() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(int codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	
}
