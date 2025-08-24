package oraiFeladatBefejezese;

public class OraiFeladatBefejezese {

	public static void main(String[] args) {
		
		System.out.printf("A négyzet kerülete: %.2f%n", keruletSzamol(5));
		System.out.printf("A téglalap kerülete: %.2f%n", keruletSzamol(6,4));
		System.out.printf("A háromszög kerülete: %.2f%n" ,keruletSzamol(3.6,8,5));
		System.out.printf("A kör kerülete: %.2f%n" ,keruletSzamol(7,true));
		System.out.printf("A négyzet területe: %.2f%n" ,teruletSzamol(5));
		System.out.printf("A téglalap területe: %.2f%n" ,teruletSzamol(6,4));
		System.out.printf("A háromszög területe: %.2f%n" ,teruletSzamol(3.6,8,5));
		System.out.printf("A kör területe: %.2f%n", teruletSzamol(7,true));
		
	}
		
	static double keruletSzamol(double a) {
		
		return 4 * a;
	}

	static double keruletSzamol(double a, double b) {
		
		return (a + b) * 2;
	}
	
	static double keruletSzamol(double a, double b, double c) {
		
		return (a + b + c);
	}
	
	static double keruletSzamol(double sugar,boolean ezEgykor) {
	
		return 2 * sugar * Math.PI;
	}
	
	static double teruletSzamol(double a) {
		
		return a * a;
	}
	
	static double teruletSzamol(double a, double b) {
		
		return a * b;
	}
	
	static double teruletSzamol(double a, double b, double c) {
		
		double t = (a + b + c) / 2; // félkerület
		
		return Math.sqrt(t * (t - a) * (t - b) * (t - c)) ;
	}
	
	static double teruletSzamol(double sugar, boolean ezEgykor) {
		
		return sugar * sugar * Math.PI ;
	}
	
}