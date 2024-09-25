package no.hvl.dat100.tabeller;

import org.slf4j.MDC;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String streng = "[";
		for (int i = 0; i < tabell.length; i++) {
			String tall = Integer.toString(tabell[i]);
			streng += tall+", ";
		}
		streng += "]";

		return streng;

	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i = 0; i <tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i ++) {
			if (tabell[i] == tall) {
				return true;
			}
		} return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1; 

	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] nytabell = new int [tabell.length];
		int index = tabell.length-1;
		for (int tall: tabell) {
			nytabell[index] = tall;
			index--;
		}

		return nytabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		int test = tabell[0];
		for (int i = 1; i <tabell.length; i++) {
			if (tabell[i] < test) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		return 
	}
}
