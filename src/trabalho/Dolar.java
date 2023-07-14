package trabalho;

public class Dolar extends Moeda {

	public Dolar(double valor, String tipo) {
		super(valor, tipo);
	}

	@Override
	void converter(double valor, String tipo) {  //adicionamos para cada moeda uma conversão em REAL, usando um valor não oficial de conversão.
		this.valor = valor * 5;
	}

}
