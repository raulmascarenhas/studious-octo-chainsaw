package estrutura;

import java.util.Iterator;
import java.util.Stack;
import java.util.Scanner;


public class Exercicio2 {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();

		
		Scanner ler = new Scanner(System.in);
		int opcao;
		String livros;
		System.out.println (""" 
				
				1: Adicionar um novo livro a pilha. Deve solicitar o nome do livro.\r\n
				2: Listar todos os livros da pilha\r\n
				3: Retirar um livro da pilha \r\n
				0: O programa deve ser finalizado. \r\n
				Digite o número da opção desejada:
				""");
do {
		System.out.println("\n Opção: ");
		opcao = ler.nextInt() ;
		ler.nextLine();
		
		
	
		
		
			switch (opcao ) {
			case 1: 
				System.out.println ("Digite o nome de um livro: ");
				livros = ler.nextLine();
				pilha.push(livros);
				
				break;
				
			case 2: 
				if (pilha.isEmpty()) {
					System.out.println("não há livros na pilha! ");}
				else {
				System.out.println ("Lista de livros");
				System.out.println(pilha);
				
				}
				break;
			
			case 3: 
				if (pilha.isEmpty()) {
					System.out.println ("A pilha esta vazia");}
				else {
						pilha.pop();
						System.out.println(pilha);
						System.out.println ("\n O livro foi retirado");
					}
				break;
				
			case 0: 
				System.out.println ("programa finalizado!");
				
				break;
			default:
				
					System.out.println("Opção invalida");
			}
			
			
			
		}
			while(opcao != 0);
		}
		
	}

