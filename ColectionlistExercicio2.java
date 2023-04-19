package colection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ColectionlistExercicio2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int i;
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		System.out.println("digite o numero desejado ");

		i = ler.nextInt();

		if (!numeros.contains(i)) {

			System.out.println("numero invalido! ");
		}

		else
			System.out.println("\nA posição do numero é: " + numeros.indexOf(i));

	}
}