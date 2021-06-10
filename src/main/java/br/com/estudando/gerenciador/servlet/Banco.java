package br.com.estudando.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> listaEmpresas = new ArrayList<>();
	
	public void adiciona(Empresa empresa) {
		this.listaEmpresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return this.getEmpresas();
	}
}
