package trabalho;                               //Aluno Adão Biotto   RU: RU: 4316389
 
public abstract class Moeda {

	protected double valor;
	protected String tipo;

	public Moeda(double valor, String tipo) {  //criamos um construtor que obriga o usuario a por o valor e tambem qual o tipo de moeda : Dolar,Euro ou Real.
		this.valor = valor;
		this.tipo = tipo;
	}

	public double getValor() {   //implementamos os metodos geter  e seters;
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	abstract void converter(double valor, String tipo);

	@Override
	public String toString() {
		return tipo + ": " + valor;
	}
}