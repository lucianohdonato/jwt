package com.springclass.token.baseDados;

import java.util.ArrayList;
import java.util.List;

import com.springclass.token.model.Usuario;

public class BaseDadosUsuarios {
	private List<Usuario> listaUsuarios = new ArrayList<Usuario>();

	public BaseDadosUsuarios() {
		super();
		listaUsuarios.add(new Usuario("user", "1234"));
		listaUsuarios.add(new Usuario("usuario", "senha"));
		listaUsuarios.add(new Usuario("username", "password"));
		listaUsuarios.add(new Usuario("admin", "password"));
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuarios;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuarios = listaUsuario;
	}
	
	
}
