package feladat1;

import java.util.Scanner;

/* Kérje be két ember magasságát centiméterben.
Állapítsa meg és írja ki melyikük a magasabb és mennyivel.
Legyen megfelelő kiírás abban az esetben is, ha egyforma magasak.
*/

public class Feladat1_A {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Adja meg az első ember magasságát (cm): ");
		int mag1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Adja meg a második ember magasságát (cm): ");
		int mag2 = Integer.parseInt(sc.nextLine());
		
		if (mag1 > mag2) {
			System.out.println("Az első ember a magasabb " + (mag1 - mag2) + "cm-rel.");
		}	else if (mag1 < mag2) {
			System.out.println("A második ember a magasabb " + (mag2 - mag1) + "cm-rel.");
		}	else {
			System.out.println("A két ember egyforma magas " + (mag1) + "cm.");
		}
		sc.close();
	}

}
