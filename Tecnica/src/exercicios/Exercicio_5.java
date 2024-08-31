package exercicios;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite uma palavra ou uma frase: ");
		String palavra = in.nextLine();
		
		char[] caracteres = new char[palavra.length()];
		for(int i = 0; i < caracteres.length; i++) {
			caracteres[i] = palavra.charAt(i);
		}
		
		char[] caracteresInvertido = new char[caracteres.length];
		for(int i = 1; i <= caracteres.length; i++) {
			caracteresInvertido[i - 1] = caracteres[caracteres.length - i];
		}
		
		for(int i = 0; i < caracteresInvertido.length; i++) {
			System.out.print(caracteresInvertido[i]);
		}
	}

}
