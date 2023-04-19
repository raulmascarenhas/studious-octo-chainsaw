
/* neste exercicio o programa deverá solicitar ao usuário, que digite via teclado 5 cores e deverá adicioná-las individualmente no ArrayList. 
 * Em seguida, Mostre na tela todas as cores que foram adicionadas. 
Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.*/



package colection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ColectionListExercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);               // adiciono Scanner ler para que o programa leia o que sera digitado no console
		String cores;                                       // criei uma string com nome "cores"
		int i;                                              // criei um inteiro com nome " i"
		ArrayList<String> cor = new ArrayList<String>(); 	// array List do tipo String chamado "cor"
		System.out.println ("Insira 5 cores: " );

		for (i=0; i<5; i++) {
			cores =ler.next();
			cor.add(cores);
			
		}
		Collections.sort(cor);
		System.out.println("\nCores ordenadas...");
		System.out.println(cor);	
		
		
	}

}

