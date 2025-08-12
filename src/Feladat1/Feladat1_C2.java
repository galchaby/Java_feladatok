package Feladat1;

import java.util.Scanner;

/* 
Kérjen be egy egyjegyű pozitív egész számot. Vizsgálja meg a számot.
A következő üzenetek közül a vizsgálatnak megfelelőt írja ki:
A szám nem nagyobb háromnál; A szám 4 és 6 közötti;
A szám nagyobb hatnál; Nem megfelelő értéket adott meg
Kétféleképpen oldja meg a feladatot, elágazásokkal és switch case szerkezettel is!
*/ 

public class Feladat1_C2 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Kérem adjon meg egy egész számot 1-9ig");
	
	int szam = Integer.parseInt(sc.nextLine());
	
	switch (szam) {
		case 1:
		case 2:
		case 3:
			System.out.println("A szám nem nagyobb háromnál");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("A szám 4 és 6 közötti");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("A szám nagyobb hatnál");
			break;
		
		default: 
		System.out.println("Nem megfelelő értéket adott meg");
		}
	sc.close();

	}

}
