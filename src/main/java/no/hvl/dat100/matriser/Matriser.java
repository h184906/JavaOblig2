package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int i=0; i<matrise.length; i++) {
			System.out.println();
			for (int k=0; k<matrise[i].length; k++) {
				System.out.print(matrise[i][k]);
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String streng = "";
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				streng += matrise[i][j]+ " ";
			}
			streng += "\n";
		}

		return streng;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nymatrise = new int[matrise.length][];
		for (int i = 0; i < matrise.length; i++) {
			nymatrise[i] = new int [matrise[i].length];
		}
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nymatrise[i][j] = matrise[i][j]*tall;
			}
		}
		return nymatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		for (int i = 0; i <a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j] || a.length != b.length || a[i].length != b[i].length) {
					return false;
				}
			}
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] nymatrise = new int[matrise.length][];
		for (int i = 0; i < matrise.length; i++) {
			nymatrise[i] = new int[matrise[i].length];
		}
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nymatrise[i][j] = matrise[j][i];
			}
		}
		return nymatrise;
	}

	// f	}                                            )
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
