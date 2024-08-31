package exercicios;

public class Exercicio_1 {

	public static void main(String[] args) {
		int indice = 13, soma = 0, k = 0;
		
		while(k < indice) {
			k++;
			soma += k;
		}
		
		System.out.println("Resultado: " + soma);
		
		// O valor final de soma é igual a 91
	}

}
