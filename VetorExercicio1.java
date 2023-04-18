package ArrayVetor;

import java.util.Arrays;
import java.util.Scanner;

public class VetorExercicio1 {

		public static void main(String[] args) {
			
			
			Scanner ler = new Scanner(System.in);
			
		
			int[] veri = {1,7,4,8,5,2,9,6,3,10};
			int num; // numero digitado pelo usuario
			int i ; // representa posição no Vetor
			boolean found = false;  // rastreia a posição no velor, diz se encontrou ou nao
			
			System.out.println("\n Digite um numero: ");
			num = ler.nextInt(); // lê o numero digitado
	      
	        for (i=0 ; i < 10; i++) {   // para o 
	            if (veri[i] == num) {
	               
	            	found = true;
	                
	                break;
	            }
	        }

	        if (found) {
	            System.out.println("Encontrado " + num + " esta na posição " + i);
	        } else {
	            System.out.println(num + " não foi encontrado");
	        }
	    }
	}