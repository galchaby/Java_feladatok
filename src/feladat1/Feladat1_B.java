package feladat1;

import java.util.Scanner;

/* Kérjen be két számot (alap, kitevő), majd végezzen hatványozást ciklus
alkalmazásával.
Számolja ki és jelenítse meg az eredményt.
*/

public class Feladat1_B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Adja meg az alapot: ");
		int alap = Integer.parseInt(sc.nextLine());
				
		System.out.println("Adja meg a kitevőt: ");
		int kitevo = Integer.parseInt(sc.nextLine());
		
		int eredmeny = 1; // kiindulási alap
		for (int i = 0; i < kitevo; i++) {
			eredmeny *= alap;
		}
		System.out.println(alap + "^" + kitevo + " = " + eredmeny);
		
		sc.close();
	}

}
