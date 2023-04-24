package estrutura;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		
		Scanner ler = new Scanner(System.in);
		int opcao;
		String pessoas;
		System.out.println (""" 
				
				1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.\r\n
				2: Listar todos os Clientes na fila\r\n
				3: Chamar (retirar) uma pessoa da fila \r\n
				0: O programa deve ser finalizado. \r\n
				Digite o número da opção desejada:
				""");
do {
		System.out.println("\n Opção: ");
		opcao = ler.nextInt() ;
		ler.nextLine();
		
		
	
		
		
			switch (opcao ) {
			case 1: 
				System.out.println ("Digite um nome");
				pessoas = ler.nextLine();
				fila.add(pessoas);
				
				break;
				
			case 2: 
				if (fila.isEmpty()) {
					System.out.println("não ha clientes na fila");}
				else {
				System.out.println ("Lista dos clientes");
				System.out.println(fila);
				
				}
				break;
			
			case 3: 
				if (fila.isEmpty()) {
					System.out.println ("A fila esta vazia");}
				else {
						fila.remove();
						System.out.println(fila);
						System.out.println ("\n O cliente foi chamado");
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


