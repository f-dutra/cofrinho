package uninter;

public class Dolar extends Moeda {
	public Dolar(double inicial) {
		this.valor = inicial;
	}
	
	@Override
	public void info() {
		System.out.println("Dolar - " + valor);
	}
	@Override
	public double convert() {
		return this.valor * 6;
	}
	
	// Necessário para remover a moeda
	// Ao fazer lista.remove(m) ele comparará se m é do mesmo tipo de 
	// um objeto na lista e se possui o mesmo valor desse objeto
	// se sim, removerá o objeto.
	
	@Override
	public boolean equals(Object ob) {
		// Permite acessar o valor de ob
		// Como é passado como Object, o valor n é acessível
		Dolar obThis = (Dolar)ob;
		
		if (this.getClass() != ob.getClass()) {
			return false;
		}
		else if (this.valor != obThis.valor) {
			return false;
		}
		else {
			return true;

		}
	}
}

