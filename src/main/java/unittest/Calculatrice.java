package unittest;

public class Calculatrice {

	public static int divise(int a, int b) throws MonException {
		if (b == 0) {
			throw new MonException("Ca ne marche pas!");
		}
		return a / b;
	}
}
