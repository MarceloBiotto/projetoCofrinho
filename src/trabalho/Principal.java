package trabalho;                                  //Aluno Adão Biotto   RU: RU: 4316389

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		double total = 0;  

		Scanner moeda = new Scanner(System.in);

		int opcao;

		Estoque estoque = new Estoque();
											// iniciamos apresentando o menu com as opções que  o usuário pode tomar
		System.out.println("Menu");
		System.out.println("1-Adicionar");   // opção de adicionar, que levara o usuario para a tela de escolher entre as moedas disponiveis
		System.out.println("2-Remover");    // função de remover moeda, na qual ele poderá optar por retirar totalmente uma determinada moeda previamente add.
		System.out.println("3-Converter");   // o metodo converter que irá converter a moeda selecionada para o REAL.
		System.out.println("4-Listar");      // metodo listar que irá listar todas as moedas já add ao cofrinho
		System.out.println("5-Total convertido"); // Total convertido mostrará a conversão de todas as moedas add ao cofrinho para o REAL.
		System.out.println("0-Encerrar");    //Encerrar o programa

		opcao = moeda.nextInt();

		while (opcao != 0) {    
			switch (opcao) {
			case 1: // Adicionar
				int tipoMoeda = 0;
				while (tipoMoeda > 3 || tipoMoeda <= 0) {   // criamos um while para o usuario ser forçado a escolher uma opção para seguir.
					System.out.println("1-Dolar");   //dolar
					System.out.println("2-Euro");    // euro
					System.out.println("3-Real");   // real
					tipoMoeda = moeda.nextInt();
				}
				System.out.println("Qual o valor?");  //apos escolher entre as opçoes disponiveis o usuario da input do valor desejado.
				double valor = moeda.nextDouble();

				if (tipoMoeda == 1) {
					Dolar dolar = new Dolar(valor, "Dólar");
					estoque.adicionar(dolar);
				} else if (tipoMoeda == 2) {
					Euro euro = new Euro(valor, "Euro");
					estoque.adicionar(euro);
				} else {
					Real real = new Real(valor, "Real");
					estoque.adicionar(real);
				}

				break;

			case 2: // Remover
				int removerMoeda = 0;
				while (removerMoeda > 3 || removerMoeda <= 0) {  // aqui podemos escolher entre as moedas disponiveis para retira-las totalmente do cofrinho
					System.out.println("1-Dolar");
					System.out.println("2-Euro");
					System.out.println("3-Real");
					removerMoeda = moeda.nextInt();
				}
				
				if (removerMoeda == 1) {    //criamos ifs e else ifs para pegar exatamente qual modelo o usuario deseja retirar
					Dolar dolar = new Dolar(0, "Dólar");
					estoque.remover(dolar);
				} else if (removerMoeda == 2) {
					Euro euro = new Euro(0, "Euro");
					estoque.remover(euro);
				} else {
					Real real = new Real(0, "Real");
					estoque.remover(real);
				}
				
				break;

			case 3:
				int converterMoeda = 0;   //aqui podemos converter qualquer uma das moedas para o REAL somente.
				System.out.println("Qual moeda deseja converter?");
				while (converterMoeda > 3 || converterMoeda <= 0) {
					System.out.println("1-Dolar");
					System.out.println("2-Euro");
					System.out.println("3-Real");
					converterMoeda = moeda.nextInt();

					if (converterMoeda == 1) {
						System.out.println("Qual o valor em dólar?");
						double valorDolar = moeda.nextDouble();
						Dolar dolar = new Dolar(valorDolar, "Dólar");
						dolar.converter(valorDolar, "Real");
						System.out.println("Valor em Real: " + dolar.getValor());
					} else if (converterMoeda == 2) {
						System.out.println("Qual o valor em euro?");
						double valorEuro = moeda.nextDouble();
						Euro euro = new Euro(valorEuro, "Euro");
						euro.converter(valorEuro, "Real");
						System.out.println("Valor em Real: " + euro.getValor());
					} else {
						System.out.println("Qual o valor em real?");
						double valorReal = moeda.nextDouble();
						Real real = new Real(valorReal, "Real");
						real.converter(valorReal, "Dólar");
						System.out.println("Valor em Real: " + real.getValor());
					}

				}

				break;

			case 4:
				estoque.listar();   //opção que lista todas as moedas ja adicionadas
				break;

			
			case 5:
			    double totalConvertido = estoque.totalConvertido();   //aqui podemos pegar todas as moedas adicionadas ao cofrinho e exibir o total em REAL.
			    System.out.println("Total convertido: " + totalConvertido);
			    break;

			default:
				System.out.println("Opção inválida!");

			}

			System.out.println("Menu");
			System.out.println("1-Adicionar");
			System.out.println("2-Remover");
			System.out.println("3-Converter");
			System.out.println("4-Listar");
			System.out.println("5-Total convertido");
			System.out.println("0-Encerrar");

			opcao = moeda.nextInt();
		}

	}

}
