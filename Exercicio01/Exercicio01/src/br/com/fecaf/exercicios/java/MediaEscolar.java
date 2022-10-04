package br.com.fecaf.exercicios.java;

import java.util.Scanner;

public class MediaEscolar {

	public static void main(String[] args) {
	//Nome:Jean Felipe Ermelindo 

	/*Código que possibilita a realização de calcular a média do aluno, se ele vai passar 
	de semestre ou repetir, com vários parâmetros e 
	entradas de dados, como o nome e o sexo do aluno, como tambem do professor, resultando na saída final.*/
		
	//variaveis
	String nomeAluno = "", nomeProfessor = "", sexoProfessor = "";
	String sexoAluno = "", curso = "", disciplina = "";
	int nota1, nota2, nota3, nota4, media = 0, exame = 0, mediaExame = 0;
	boolean erro = false;
	String aprovado = "";
		
	//Instancia de classe
	Scanner entradaDados = new Scanner(System.in);
		
	//Entrada de dados
	System.out.println("Nome do aluno: ");
	nomeAluno = entradaDados.next().toLowerCase();
			
	System.out.println("Nome do professor: ");
	nomeProfessor = entradaDados.next().toLowerCase();
			
	System.out.println("Sexo do professor: ");
	sexoProfessor = entradaDados.next().toLowerCase();
			
	System.out.println("Sexo do aluno: ");
	sexoAluno = entradaDados.next().toLowerCase();
			
	System.out.println("Curso: ");
	curso = entradaDados.next().toLowerCase();
			
	System.out.println("Diciplina: "); 
	disciplina = entradaDados.next(); 
			
	System.out.println("Digite a primeira nota: ");
	nota1 = entradaDados.nextInt();

	System.out.println("Digite a segunda nota: ");
	nota2 = entradaDados.nextInt();
			
	System.out.println("Digite a terceira nota: ");
	nota3 = entradaDados.nextInt();
			
	System.out.println("Digite a quarta nota: ");
	nota4 = entradaDados.nextInt();
			
	//Estrutura condicional.
			
	media = (nota1 + nota2 + nota3 + nota4) / 4;

		
	if((nota1 > 100 || nota1 < 0) || (nota2 > 100 || nota2 < 0) || (nota3 > 100 || nota3 < 0) || (nota4 > 100 || nota4 < 0)) {
	System.out.println("Erro, Digite as notas novamente.");
	System.exit(-1);    //Correção de bugs caso nota for menor que 0 ou maior que 100.
	}
			
	else if (media > 70)
	aprovado = "Aprovado";
			
	else if (media < 50)
	aprovado = "Reprovado";
			 
	else if (media >= 50 && media <= 69.9){
	System.out.println("Informe a nota do exame: ");
	exame = entradaDados.nextInt();
	mediaExame = (media + exame) / 2;
	erro = true;
	}
	
		if (erro == true) {
			if(mediaExame > 100 || mediaExame < 0)
			System.out.println("Erro, Digite as notas novamente.");  
			//Outra verificação de bug caso media do exame for maior que 100 ou menor que 0.	   
		    else if(mediaExame > 60){
			aprovado = "Aprovado";
			    	
			} 
			else if(mediaExame < 60){
		    aprovado = "Reprovado";   
			  }
		}
		
		 
		if (!sexoAluno.equals("masculino") && !sexoAluno.equals("feminino")) {
	    System.out.println("Erro, Informe se é Masculino ou Feminino!");
	    System.exit(-1);// Correção de bugs caso não seja masculino ou feminino! 
		}
		    
		if (sexoAluno.equals ("masculino")) 
		    sexoAluno = "O Aluno";
		 	
		if(sexoProfessor.equals ("masculino")) 
			sexoProfessor = "Professor :"; 	
		    	
		if(sexoAluno.equals ("feminino")) 
		    sexoAluno = "A aluna";
		         
		if (sexoProfessor.equals ("feminino")) 
		    sexoProfessor = "Professora: ";
		
		    //Saídas de dados
		    System.out.println(sexoAluno+" "+nomeAluno +" foi " +aprovado+ " na disciplina: " +disciplina);
		    System.out.println("Curso: "+curso);
		    System.out.println(sexoProfessor+" "+nomeProfessor);
		    System.out.println("Notas do aluno: \nNota1: "+ nota1+ "\nNota2: "+ nota2
		    		 + "\nNota3: "+ nota3 + "\nNota4: "+ nota4);
		    System.out.println("Média final: "+media);
		    if(erro == true) { //Sáidas de dados caso o aluno fique de exame.
		    	System.out.println("Nota do exame: " + exame);
		    	System.out.println("Média final do exame: " + mediaExame);
		    }
		    
		 }
	}

	
  
