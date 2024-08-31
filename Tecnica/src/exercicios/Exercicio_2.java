package exercicios;

import java.util.Scanner;

public class Exercicio_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite um número para saber se faz parte, ou não, da sequencia de Fibonacci: ");
		int numero = in.nextInt();
		
		int anterior = 0, atual = 1, proximo = 0;
		boolean pertence = false;
		
		if(numero == 0) {
			pertence = true;
		}
		
		while(atual <= numero) {
			
			if(atual == numero) {
				pertence = true;
				break;
			}
			
			proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
		}
		
		if(pertence) {
			System.out.println("O numero " + numero + " pertence a sequencia de Fibonacci");
		} else {
			System.out.println("O numero " + numero + " não pertence a sequencia de Fibonacci");
		}
	}
}
