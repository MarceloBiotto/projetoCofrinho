package trabalho;

public class Real extends Moeda {

	public Real(double valor, String tipo) {
		super(valor, tipo);
	}

	@Override
	void converter(double valor, String tipo) {
		this.valor = valor;
	}

}