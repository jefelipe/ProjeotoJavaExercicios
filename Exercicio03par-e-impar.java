package br.com.fecaf.exercicio02;

import java.util.Scanner;

public class Exercicio02 {
	//Nome: Jean Felipe Ermelindo
	//Código que mostra as quantidade de numeros pares e impares de acordo com o 
	//número inicial e final.
	
	public static void main(String[] args) {
		
		int valorInical;
		int valorFinal;
		
		Scanner entradaDados = new Scanner(System.in);
		
		System.out.println("Informe o numero inicial: ");
		valorInical = entradaDados.nextInt();
		
		System.out.println("Informe o numero final: ");
		valorFinal = entradaDados.nextInt();	
				
		
		if (calcularPar(valorInical, valorFinal))  {	
			System.out.println("Informe o valor inicial entre 0 até 500 e valor final entre 100 e 1000!");
					
			}
			}
	
	public static boolean calcularPar(int valorInicial, int valorFinal) {
		
		int numeroInicial = valorInicial, cont3 = valorInicial;
		int numeroFinal = valorFinal;
		int par = 0;
		int impar = 0;
		int cont = 0;
		int cont2 = 0;
		
		boolean erro = false;
		
		if(numeroInicial > numeroFinal ) {
			System.out.println("O numero Inicial não pode ser maior que o final!");
		}
		else if(numeroInicial >= numeroFinal) {
			System.out.println("O numero inicial não pode ser igual ao numero final");
		}
		else if((( numeroInicial >= 0) && (numeroInicial <= 500)) && ((numeroFinal >= 100) && (numeroFinal <=1000))) {
			System.out.println("Lista de numeros pares: ");
				while(numeroInicial <= numeroFinal) {
					if (numeroInicial % 2 == 0) {
					par = numeroInicial;
					System.out.println("\n"+par);
					cont++;
					}
					numeroInicial++;
					}
				System.out.println("Quantidade de numeros pares: " +cont);
				System.out.println("\nLista de numeros Impares: ");
				while(cont3 <= numeroFinal) {
					if (cont3 % 2 != 0) {
					impar = cont3;
					System.out.println("\n"+impar);
					cont2++;
					}
					cont3++;
					}
				
					System.out.println("Quantidade de numero impares : " +cont2);
				
			}else {
				erro = true;
			}
		
	        
			
	        
	
		
		if(erro) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
}
