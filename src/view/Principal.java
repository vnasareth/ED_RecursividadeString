package view;

//importando a classe que inverte a String
import controller.StringController;

public class Principal {

	public static void main(String[] args) {
		//M�todo construtor
		StringController str = new StringController();
		//Colocando caracteres na vari�vel nome
		String nome = "Vanessa Nasareth";
		String saida = str.inverteString(nome, nome.length());
		System.out.println(saida);

	}

}
