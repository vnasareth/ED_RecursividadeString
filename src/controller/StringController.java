package controller;

public class StringController {
	
	public StringController() {
		super();
	}
	
	public String inverteString(String nome, int tamanho) {
		//Condi��o de parada = 0, vai pegar o tamanho e ir diminuindo e retornando at� chegar em 0
		if (tamanho == 0) {
			return "";
		}else {
			//Vai diminuindo -1 do nome com substring, (tamanho = tamanho - 1) e vai retornando sempre o ultimo caracter, at� chegar em 0
			return nome.substring(tamanho - 1, tamanho)+inverteString(nome, tamanho - 1);
		}
		
	}

}

