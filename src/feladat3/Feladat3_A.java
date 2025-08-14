package feladat3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/*
 * A., Kérjünk be a felhasználótól tíz keresztnevet.
•
A neveket nagybetűs formátumban, vektorban tároljuk!
•
Listázzuk ki a tömb minden második elemét!
•
Állapítsuk meg, melyik a leghosszabb név!
•
Írjuk ki, melyik névben van a legtöbb ’s’ betű!
 */

public class Feladat3_A {

	public static void main(String[] args) {
		
		// Kérjünk be a felhasználótól tíz keresztnevet. A neveket nagybetűs formátumban, vektorban tároljuk!
		
		Scanner sc = new Scanner(System.in);
		Vector<String> nevek = new Vector<>(10);
		
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + ". név: ");
			String nev = sc.nextLine().toUpperCase();
			nevek.add(nev);
		}
		System.out.println(" ");
		
		// Listázzuk ki a tömb minden második elemét!
		
		System.out.println("A lista minden második eleme: ");
		for (int i = 1; i < nevek.size(); i+= 2) {
			System.out.println(nevek.get(i));
		}
		System.out.println(" ");

		// Állapítsuk meg, melyik a leghosszabb név!
		
		String lhnev = nevek.get(0);
		for (String nev : nevek) {
			if (nev.length() > lhnev.length()) {
				lhnev = nev;
			}
		}
		System.out.println("A leghosszabb név: " + lhnev);
		System.out.println(" ");
		
		// Írjuk ki, melyik névben van a legtöbb ’s’ betű!
		
		List<String> ltsnevek = new ArrayList<>();
		int lts = 0;
		
		for (String nev : nevek) {
			int count = 0;
			for (int i = 0; i < nev.length(); i++) {
				if (nev.charAt(i) == 'S') {
					count++;
				}
			}
			if (count > lts) {
				lts = count;
				ltsnevek.clear();
				ltsnevek.add(nev);
			} else if (count == lts) {
				ltsnevek.add(nev);
			}
		}
		System.out.println("A legtöbb 'S' betűt tartalmazó név(ek): " + ltsnevek);
	}

}
