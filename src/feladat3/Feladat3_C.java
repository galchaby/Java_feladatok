package feladat3;

import java.util.Random;

/*
 * Töltsünk fel egy 3x3 as mátrixot egyjegyű véletlenszámok négyzetre emelt értékeivel.  
Listázzuk ki a főátlóban található számokat és összegüket!  
Listázzuk ki fordított sorrendben (az utolsó elemtől az elsőig) az eredetileg generált számokat!
 */

public class Feladat3_C {

	public static void main(String[] args) {

		// Töltsünk fel egy 3x3 as mátrixot egyjegyű véletlenszámok négyzetre emelt értékeivel.
		
		Random rnd = new Random();
		int[][] matrix = new int[3][3];
		int[][] eredeti = new int[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int szam = rnd.nextInt(9) + 1;
				eredeti[i][j] = szam;
				matrix[i][j] = szam * szam;
			}
		}
		
		// Listázzuk ki a főátlóban található számokat és összegüket!
		
		int osszeg = 0;
		System.out.print("\nFőátló elemei: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(matrix[i][i] + " ");
			osszeg += matrix[i][i];
		}
		System.out.println("\nFőátló elemeinek összege: " + osszeg);
		
		// Listázzuk ki fordított sorrendben (az utolsó elemtől az elsőig) az eredetileg generált számokat!
		
		System.out.print("\nEredeti számok fordított sorrendben: ");
			for (int i = 2; i >= 0; i--) {
				for (int j = 2; j >= 0; j--) {
					System.out.print(eredeti[i][j] + " ");
				}
			}
	}

}
