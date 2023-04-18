package LacosRepeticao;

import java.util.Scanner;

public class LaçoDeRepeticaoEx1 {

	public static <If> void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int  n1,n2,x =0;
		
		System.out.println("digite o primeiro intervalo: ");
		n1 = leia.nextInt();
		System.out.println("digite o segundo intervalo: ");
		n2 = leia.nextInt();
		
		if (n1 > n2 ) {
			System.out.println ("o intervalo é inválido!!!");
		
		}
		for(x = n1;  x<=n2; x++) {                        // x++ é a mesma cows que x = x + 1//
			if(x %3 == 0 && x % 5 == 0 ) {
				System.out.println(x +" é multiplo de 3 e 5");
			}
			
			//If( n1 < n2);
			//System.out.printf("\nMédia do alune %d foi de: %.2f",x);
			//System.out.println("\nMédia do alune "+x+" foi de: ");//9 7 5 4
			
			//somaMedia += media;//somaMedia = somaMedia + media
		}
		//mediaGeral = somaMedia / (x-1);
		//System.out.printf("\nMédia geral foi de: %.2f",mediaGeral);

	}
	}
