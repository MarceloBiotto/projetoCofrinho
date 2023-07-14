package trabalho;                                  //Aluno Adão Biotto   RU: RU: 4316389

public class Euro extends Moeda {

	public Euro(double valor, String tipo) {
		super(valor, tipo);
	}

	@Override
	void converter(double valor, String tipo) { //adicionamos para cada moeda uma conversão em REAL, usando um valor não oficial de conversão.
		this.valor = valor * 6;
	}

}
