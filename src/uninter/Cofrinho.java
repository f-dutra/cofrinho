package uninter;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<>();
	
	public void adicionar(Moeda m) {
		this.listaMoedas.add(m);
	}
	
	public void remover(Moeda m) {
		this.listaMoedas.remove(m);
	}
	
	public void listagemMoedas() {
		for (Moeda m : this.listaMoedas) {
			m.info();
		}
	}
	public double totalConvertido() {
		double valor = 0;
		for (Moeda m : this.listaMoedas) {
			valor = valor + m.convert();
		}
		return valor;
	}
}
