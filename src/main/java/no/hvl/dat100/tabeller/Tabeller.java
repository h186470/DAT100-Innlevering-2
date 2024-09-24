package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		int tabellSomSkrives[] = tabell;
		
		for(int i = 0; i < tabellSomSkrives.length; i++) {
			System.out.println("Index: " + i + " er: "+ tabellSomSkrives[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
	}

	// c)
	public static int summer(int[] tabell) {
		int tabellSomSkrives[] = tabell;
		int total = 0;
		
		for(int i = 0; i < tabellSomSkrives.length; i++) {
			int num = tabellSomSkrives[i];
			total = total + num;
		}
		
		return total;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean finnes = false;
		int i = 0;

		while (!finnes && i < tabell.length) {
			if (tall != tabell[i]) {
				i++;
			} else if (tall == tabell[i]) {
				finnes = true;
			}
		}
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int tabellSomSkrives[] = tabell;
		int num = tall;
		int posisjon = -1;

		for (int i = 0; i < tabellSomSkrives.length; i++) {
			if (tabellSomSkrives[i] == num) {
				posisjon = i;
			}
		}
		return posisjon;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
