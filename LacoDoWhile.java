package LacosRepeticao;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
		
		int tabuada,x=1,resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a tabuada que deseja visualizar:");
		tabuada = leia.nextInt();//9
		
		do {
			
			resultado = tabuada * x;
			System.out.println(tabuada+" X "+x+" = "+resultado);
			x++;
			
		}while(x<=10);

	}

}
