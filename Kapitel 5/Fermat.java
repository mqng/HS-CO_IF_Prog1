public class Fermat {

	public static void main(String[] args) {
		System.out.println(fermatTest(999983, 17));
		System.out.println(fermatTest(999984, 17));

		System.out.println(isPrime(999983));
		System.out.println(isPrime(999984));

		System.out.println(randomPrime());
	}

	static boolean isPrime(int n) {
		int a = (int) (Math.random() * 100);
		return fermatTest(n, a);
	}

	static boolean fermatTest(int n, int a) {
		boolean isPrime;
		if (pow(a, n - 1, n) == 1) {
			isPrime = true;
		} else {
			isPrime = false;
		}
		return isPrime;
	}

	static int pow(final int a, int k, final int b) {
		long x = a;
		long z = 1;
		while (k > 0)
			if (k % 2 == 0) {
				k /= 2;
				x = x * x % b;
			} else {
				k--;
				z = z * x % b;
			}
		return (int) z;
	}

	static int randomPrime() {
		int a;
		do
			a = (int) (Math.random() * Integer.MAX_VALUE);

		while (isPrime(a) != true);

		return a;

	}

}

