package br.com.estudando.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> listaEmpresas = new ArrayList<>();

	static {
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Minha Empresa - MP");
		listaEmpresas.add(empresa1);
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Nossa Empresa - jP");
		listaEmpresas.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		this.listaEmpresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return this.listaEmpresas;
	}
}
