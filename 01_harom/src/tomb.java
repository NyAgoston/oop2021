
public class tomb {

	public static void main(String[] args) {
		int[] tomb = new int[10];

		feltolt(tomb);

		for (int i = 0; i < tomb.length; i++) {
			System.out.println(tomb[i]);
		}

		System.out.println(" ");

		for (int i = tomb.length - 1; i >= 0; i--) {
			System.out.println(tomb[i]);
		}

		System.out.println("paros elemek atlaga: " + paroszamAtlaga(tomb));

		int min = tomb[0];
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i] < min) {
				min = tomb[i];
			}
		}

		System.out.println("Legkisebb elem: " + min);

		if (monotonitas(tomb)) {
			System.out.println("A tomb monoton novekvo!");
		} else {
			System.out.println("Nem monoton novekvo!");
		}

		rendezes(tomb);

		for (int i = 0; i < tomb.length; i++) {
			System.out.println(tomb[i]);
		}

	}

	private static void feltolt(int[] tomb) {

		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = (int) (Math.random() * 50) + 1;
		}

	}

	private static double paroszamAtlaga(int[] tomb) {
		int sum = 0;

		for (int i = 0; i < tomb.length; i++) {
			if (i % 2 == 0) {
				sum += tomb[i];
			}
		}
		return (double) sum / tomb.length;
	}

	private static boolean monotonitas(int[] tomb) {

		for (int i = 0; i < tomb.length - 1; i++) {
			if (tomb[i] > tomb[i + 1]) {
				return false;
			}
		}
		return true;
	}

	private static void rendezes(int[] tomb) {

		for (int i = 0; i < tomb.length - 1; i++) {
			int minindex = i;
			for (int j = i + 1; j < tomb.length; j++) {
				if (tomb[j] < tomb[minindex]) {
					minindex = j;
				}
			}
			int temp = tomb[i];
			tomb[i] = tomb[minindex];
			tomb[minindex] = temp;
		}
	}

}
