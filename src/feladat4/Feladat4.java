package feladat4;

import java.util.*;

public class Feladat4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1) Bekérés
        System.out.print("Adja meg a vállalatok számát: ");
        int vallalatokSzama = sc.nextInt();
        int[][] haviEredmenyek = eredmenyekBekerese(sc, vallalatokSzama);

        // 2) Éves eredmények kiszámítása
        int[] evesEredmenyek = mindenEvesEredmeny(haviEredmenyek);

        // 3) Havi és éves eredmények listázása
        System.out.println("\nA vállalkozások havi és éves eredményei:");
        for (int v = 0; v < vallalatokSzama; v++) {
            System.out.println("Vállalat " + (v + 1) + " havi eredményei: " 
                               + Arrays.toString(haviEredmenyek[v]) 
                               + " | Éves összesen: " + evesEredmenyek[v]);
        }

        // 4) Véletlen hónap eredményei
        Random rnd = new Random();
        int honap = rnd.nextInt(12) + 1;
        int[] adottHonap = adottHonapEredmenyei(haviEredmenyek, honap);
        System.out.println("\nA(z) " + honap + ". hónap eredményei: " + Arrays.toString(adottHonap));

        // 5) Legjobb vállalat
        int legjobbIndex = legjobbVallalat(evesEredmenyek);
        System.out.println("\nA legjobb éves eredményt a(z) " + (legjobbIndex + 1) + ". vállalat érte el!");

        // 6) Veszteséges hónapok
        System.out.println("\nVeszteséges hónapok vállalatonként:");
        for (int v = 0; v < vallalatokSzama; v++) {
            int veszteseg = vesztesegesHonapok(haviEredmenyek[v]);
            System.out.println("Vállalat " + (v + 1) + ": " + veszteseg + " veszteséges hónap");
        }

        sc.close();
    }

    // METÓDUSOK

    static int[][] eredmenyekBekerese(Scanner sc, int vallalatokSzama) {
        int[][] eredmenyek = new int[vallalatokSzama][12];
        for (int v = 0; v < vallalatokSzama; v++) {
            System.out.println("Adja meg a(z) " + (v + 1) + ". vállalat 12 havi eredményét:");
            for (int h = 0; h < 12; h++) {
                eredmenyek[v][h] = sc.nextInt();
            }
        }
        return eredmenyek;
    }

    static int evesEredmeny(int[] haviEredmenyek) {
        int osszeg = 0;
        for (int ertek : haviEredmenyek) {
            osszeg += ertek;
        }
        return osszeg;
    }

    static int[] mindenEvesEredmeny(int[][] adatok) {
        int[] osszes = new int[adatok.length];
        for (int i = 0; i < adatok.length; i++) {
            osszes[i] = evesEredmeny(adatok[i]);
        }
        return osszes;
    }

    static int legjobbVallalat(int[] evesEredmenyek) {
        int maxIndex = 0;
        for (int i = 1; i < evesEredmenyek.length; i++) {
            if (evesEredmenyek[i] > evesEredmenyek[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static int vesztesegesHonapok(int[] haviEredmenyek) {
        int db = 0;
        for (int ertek : haviEredmenyek) {
            if (ertek < 0) db++;
        }
        return db;
    }

    static int[] adottHonapEredmenyei(int[][] adatok, int honap) {
        int[] eredmenyek = new int[adatok.length];
        for (int v = 0; v < adatok.length; v++) {
            eredmenyek[v] = adatok[v][honap - 1];
        }
        return eredmenyek;
    }
}
