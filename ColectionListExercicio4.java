package colection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

	
public class ColectionListExercicio4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int n;
		Set<Integer> nume = new HashSet<Integer>();

		nume.add(2);
		nume.add(5);
		nume.add(1);
		nume.add(3);
		nume.add(4);
		nume.add(9);
		nume.add(7);
		nume.add(8);
		nume.add(10);
		nume.add(6);
		
		System.out.println ("digite o numero que deseja encontrar:  "  );
		n = ler.nextInt();

		if (nume.contains(n)) {

			System.out.println("numero encontrado! ");
		}

		else
			System.out.printf("\nA Numero não encontrado! ");	
		
	}
}
