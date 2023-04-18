package LacosRepeticao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		int idade,genero,cat,contNPB=0,contNMF=0,contHM40=0,contMF30=0;
		String escolha = "s";
		
		Scanner leia = new Scanner(System.in);
		
		while(escolha.equalsIgnoreCase("s")) {
			System.out.println("\nDigite sua idade: ");
			idade = leia.nextInt();//145
			while(idade<0 || idade> 140) {
				System.out.println("\nIdade Inválida. Digite novamente sua idade: ");
				idade = leia.nextInt(); // -5 28
			}
			System.out.println("\nDigite o seu genero: ");
			System.out.println("\n1--Masculino\n2--Feminino\n3-Não se aplica");
			genero = leia.nextInt();
			while(genero<1 || genero>3) {
				System.out.println("\nGenero inválido. Digite novamente o seu genero: ");
				System.out.println("\n1--Masculino\n2--Feminino\n3-Não se aplica");
				genero = leia.nextInt();
			}
			System.out.println("\nDigite a categoria: ");
			System.out.println("\n1--BACKEND\n2-FrontEnd\n3-Mobile\n4-FullStack");
			cat = leia.nextInt();
			while(cat<1 || cat>4) {
				System.out.println("\nCategoria inválida. Digite novamente a categoria: ");
				System.out.println("\n1--BACKEND\n2-FrontEnd\n3-Mobile\n4-FullStack");
				cat = leia.nextInt();
			}
			
			System.out.println("\nDeseja continuar??? (S-Sim / N- Não)");
			escolha = leia.next();
			
			if(cat==1) {
				contNPB++;
			}
			if(genero == 2 && cat == 2) {
				contNMF++;
			}
			if(idade > 40 && genero == 1 && cat == 3) {
				contHM40++;
			}
			if(idade < 30 && genero == 2 && cat == 4) {
				contMF30++;
			}
		}
		
		System.out.println("\nTotal de pessoas desenvolvedoras Backend: "+contNPB);
		System.out.println("\nTotal de mulheres desenvolvedoras Frontend: "+contNMF);
		System.out.println("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: "+contHM40);
		System.out.println("\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos: "+contMF30);

	}

}
