package trabalho;                                                //Aluno Adão Biotto   RU: RU: 4316389

import java.util.ArrayList;

public class Estoque {

    ArrayList<Moeda> listaMoeda = new ArrayList<Moeda>();  //criamos uma  lista para adicionar as moedas

    public void adicionar(Moeda moeda) {    //criamos o metodo de adicionar a moeda
        listaMoeda.add(moeda);
    }
 
    public void remover(Moeda moeda) {    //metodo para remover moedas.
        for (int i = 0; i < listaMoeda.size(); i++) {
            Moeda m = listaMoeda.get(i);
            if (m.getTipo().equals(moeda.getTipo())) {
                listaMoeda.remove(i);
                break;
            }
        }
    }

    public void listar() {                     //criamos o metodo para listar todos os valores adicionados ao cofrinho
        for (Moeda moeda : listaMoeda) {
            System.out.println(moeda);
        }
    }

    public double totalConvertido() {   //aqui implementamos o metodo para mostrar o total convertido de todas as moedas no cofrinho
        double total = 0;
        for (Moeda moeda : listaMoeda) {
            if (!moeda.getTipo().equals("Real")) {
                moeda.converter(moeda.getValor(), "Real");
                total += moeda.getValor();
            } else {
                total += moeda.getValor();
            }
        }
        return total;
    }
}
