package feladat3;

import java.util.Random;

/*
 * Töltsünk fel egy 4x3 as mátrixot 50 és 100 közötti véletlenszámokkal.
•
Transzponáljuk egy másik mátrixba!
•
Listázzuk ki mindkét mátrixot a megfelelő sor/oszlop formátumban!
 */

public class Feladat3_B {

	public static void main(String[] args) {
		
		// Töltsünk fel egy 4x3 as mátrixot 50 és 100 közötti véletlenszámokkal.
		
		int [][] matrix = new int [4][3];
		Random rnd = new Random();
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rnd.nextInt(51) + 50;
			}
		}
		
		// Transzponáljuk egy másik mátrixba!
		
		int[][] transzponalt = new int[3][4];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				transzponalt[j][i] = matrix[i][j];
			}
		}

		// Listázzuk ki mindkét mátrixot a megfelelő sor/oszlop formátumban!
		
		System.out.println("Eredeti mátrix(4X3):");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
				
		System.out.println("\nTranszponált mátrix (3X4):");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(transzponalt[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
