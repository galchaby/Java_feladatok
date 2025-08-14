package feladat2;

import java.util.Scanner;

/*
 * Töltsünk fel egy 10 elemu tömböt a felhasználótól bekért egész számokkal.
A.
Irjuk ki az adatokat egymás mellé szóközzel elválasztva!
B.
Irjuk ki az elso elem négyzetét!
C.
Irjuk ki a páratlan számokat és indexeiket (soronként egy szám index párt kiírva)!
D.
Irjuk ki a hárommal osztható számokat a tömb utolsó elemétol az elso felé haladva!
E.
Irjuk ki az elso öt elem összegét és külön az utolsó öt elem összegét!
F.
Hozzunk létre egy ugyancsak 10 elemu, de kétdimenziós tömböt és töltsük fel
ugyanazokkal az értékekkel mint az elso tömböt!
G.
Listázzuk ki egymás alá a számokat úgy, hogy minden szám mellé írjuk ki mindkét
tömbbeli indexét!
 */

public class Feladat2 {

	public static void main(String[] args) {
		
	// Töltsünk fel egy 10 elemu tömböt a felhasználótól bekért egész számokkal.
		
		Scanner sc = new Scanner(System.in);
		int[] tomb = new int[10];
	
		// Felhasználói feltöltés
	for (int i = 0; i < tomb.length; i++) {
		
		System.out.println("Kérem a következő számot");
		tomb[i] = sc.nextInt();
	}
	
	// A.	Irjuk ki az adatokat egymás mellé szóközzel elválasztva!
	
	System.out.println("\nA) A tömb elemei: ");
	for (int i  = 0; i < tomb.length; i++) {
		System.out.print(tomb[i] + " ");
	}
	System.out.println(" ");
	
	// B.	Irjuk ki az elso elem négyzetét!
	
	System.out.println("\nB) Az első elem négyzete: " + (tomb[0] * tomb[0]));
	
	// C.	Irjuk ki a páratlan számokat és indexeiket (soronként egy szám index párt kiírva)!
	
	System.out.println("\nC) Páratlan számok és indexeik: ");
	for (int i = 0; i < tomb.length; i++) {
		if (tomb[i] % 2 != 0) {
			System.out.println("Index: " + i + " Érték: " + tomb[i]);
		}
	}
	System.out.println(" ");
	
	// D.	Irjuk ki a hárommal osztható számokat a tömb utolsó elemétol az elso felé haladva!
	
	System.out.println("\nD) Hárommal osztható számok visszafelé: ");
	for (int i = tomb.length - 1; i >= 0; i--) {
		if (tomb[i] % 3 == 0) {
			System.out.print(tomb[i] + " ");
		}
	}
	System.out.println(" ");
	
	// E.	Irjuk ki az elso öt elem összegét és külön az utolsó öt elem összegét!
	
	int ff = 0, lf = 0;
	for (int i = 0; i < 5; i++ ) {
		ff += tomb[i];
	}
	for (int i = 5; i < 10; i++) {
		lf += tomb[i];
	}
	System.out.println("\nE) Első öt elem összege: " + ff);
	System.out.println(" Utolsó öt elem összege: " + lf);
	System.out.println(" ");
	
	// F.	Hozzunk létre egy ugyancsak 10 elemu, de kétdimenziós tömböt és töltsük fel	ugyanazokkal az értékekkel mint az elso tömböt!
	
	int [][] tomb2d = new int[2][10]; // 2 sor, 10 oszlop
	for (int i = 0; i < tomb.length; i++) {
		tomb2d[0][i] = tomb[i];
		tomb2d[1][i] = tomb[i];
	}
	System.out.println(" ");
	
	// G.	Listázzuk ki egymás alá a számokat úgy, hogy minden szám mellé írjuk ki mindkét	tömbbeli indexét!
	
	System.out.println("\nG) Számok és mindkét tömb indexei: ");
	for (int i= 0; i < tomb.length; i++) {
		System.out.println("Érték: " + tomb[i] + " | 1d index: " + i + " | 2d index: [0][" + i + "] és [1][" + i + "]");
	}
	sc.close();

	}

}
