package LacosRepeticao;

import java.util.Scanner;

public class WhileEx3 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int idade,pesmen21=0,pesmai50=0;

        System.out.println("\nDigite uma idade: ");
        idade = leia.nextInt();

        while(idade > 0) {

            if(idade <= 21) {
                pesmen21++;
            }else {
                pesmai50++;
            }
            System.out.println("\nDigite uma idade: ");
            idade = leia.nextInt();

        }

        System.out.println("\nTotal de pessoas menores de 21 anos: "+pesmen21);
        System.out.println("\nTotal de pessoas maiores de 50 anos: "+pesmai50);

    }

}
