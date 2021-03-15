
public class leibniz {

	public static void main(String[] args) {
		int felso = 1;
		int also = 1;
		double pi = 0;

		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				pi += (double) felso / also;
			} else {
				pi -= (double) felso / also;
			}
			also += 2;
		}

		System.out.println("pi: " + 4 * pi);

		int numerator = 2;
		int denominator = 3;
		double pii = 2;

		int seged = 0;

		for (int i = 1; i <= 1000; i++) {
			pii *= (double) numerator / denominator;
			if (seged == 0) {
				numerator += 2;
				seged = 1;
			} else {
				denominator += 2;
				seged = 0;
			}
		}

		System.out.println("pi = " + 2 * pii);

	}

}
