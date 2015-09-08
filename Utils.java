package exercice_github;

public class Utils {

	/**
	 * Methode factoriel
	 * 
	 * @param n
	 * @return n factoriel
	 */
	public static int fac(int n) {
		if (n == 0)
			return 1;
		return n * fac(n - 1);

	}

}
