public class MathUtil {

	static boolean isEven(int zahl) {
		if (zahl % 2 == 0) {
			System.out.println("Gerade");
            boolean even = true;
			return even;
		} else {
			System.out.println("Ungerade");
            boolean even = false;
			return even;
		}

	}

	static int gcd(int zahl1, int zahl2) {
		while (zahl1 != zahl2) {
			assert (zahl1 > 0 && zahl2 > 0);
			if (zahl1 > zahl2)
				zahl1 = zahl1 - zahl2;
			else
				zahl2 = zahl2 - zahl1;
		}
		return zahl1;
	}

	static float minimum3(float a, float b, float c) {
		return Math.min(a, Math.min(b, c));
	}

	static int integerPower(int base, int exp) {
		return (int) Math.pow(base, exp);
	}

	static void printAsterisk(int n) {
		char[][] arr = new char[n][n];
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[0].length - 1; j++) {
				arr[i][j] = '*';
			}

		}
		for (char a[] : arr)
			System.out.println(a);
	}

	public static void main(String[] args) {
		System.out.println(isEven(4));

		System.out.println(gcd(33, 6));

		System.out.println(minimum3(7, 5, 9));	

		System.out.println(integerPower(5, 4));
		
		printAsterisk(5);
	}
}
