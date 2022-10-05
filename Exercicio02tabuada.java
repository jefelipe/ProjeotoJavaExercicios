package br.com.fecaf.exercicio02;

import java.util.Scanner;

public class Exercicio01 {
	
		// NOME: JEAN FELIPE ERMELINDO  
		// Código que realiza duas tabuadas, a inicial e final.
		// Informando o número inicial das tabuadas até o número final, realizando assim
		// a tabuada desejada.
	   
	public static void main(String[] args) {
		int tabInicial;
		int tabFinal;
		int numInicial;
		int numFinal;
        
		Scanner entradaDados = new Scanner(System.in);
		
		System.out.println("Informe a taboada inicial: ");
		tabInicial = entradaDados.nextInt();
		
		System.out.println("Informe a taboada final: ");
		tabFinal = entradaDados.nextInt();
		
		System.out.println("Informe o numero inicial: ");
		numInicial = entradaDados.nextInt();
		
		System.out.println("Informe o numero final: ");
		numFinal = entradaDados.nextInt();

		
		if (!calcularTabuada(tabInicial, tabFinal, numInicial, numFinal))  {	
		System.out.println("Informe a tabuada inicial e final entre 2 e 100, ");
		System.out.println("numero inicial e final entre 1 e 50 !");
				
		}
		
	}
	
	
		
	
		
		public static boolean calcularTabuada(int tab1, int tab2, int num1, int num2){
			
			int tabInicial = tab1;
			int tabFinal = tab2;
			int numInicial = num1;
			int numFinal = num2 ;
			int resultado1;
			int resultado2;
			boolean erro1 = false;
			
			
			
			
			if((tabInicial >= 2) && (tabInicial <= 100) && (tabFinal >= 2) && (tabFinal <= 100)) {
				if((numInicial >= 1)&&(numInicial <= 50)&&(numFinal >= numInicial)&&(numFinal<=50)) {
					System.out.println("Taboada do : "+ tabInicial);
					for(int i = numInicial; i <= numFinal; i++) {
						resultado1 = tabInicial * i;
						System.out.println(tabInicial + "x" + i + "=" + resultado1);
					}
					System.out.println("");
					System.out.println("Taboada do: "+ tabFinal);
					for(int n = numInicial; n <= numFinal; n++) {
						resultado2 = tabFinal * n;
						System.out.println(tabFinal + "x" + n + "=" + resultado2);
						
					}
	
				}else {
					erro1 = true;
				}
			}else {
				erro1 = true;
			}
			if(erro1){
				return false;
			}else {
				return true;
			}
		
		
		}
}


