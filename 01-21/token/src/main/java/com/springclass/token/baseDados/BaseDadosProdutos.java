package com.springclass.token.baseDados;

import java.util.ArrayList;
import java.util.List;

import com.springclass.token.model.Produto;

public class BaseDadosProdutos {
	private List<Produto> listaProdutos = new ArrayList<Produto>();

	public BaseDadosProdutos() {
		super();
		listaProdutos.add(new Produto(1, "Produto X", 100.00, 1326550010));
		listaProdutos.add(new Produto(2, "Produto Y", 150.00, 1841550010));
		listaProdutos.add(new Produto(3, "Produto Z", 370.00, 1474150010));
		listaProdutos.add(new Produto(4, "Produto A", 30.00, 1326550010));
		listaProdutos.add(new Produto(5, "Produto B", 850.00, 1557575510));
		listaProdutos.add(new Produto(6, "Produto C", 200.00, 1955544510));
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	
}
