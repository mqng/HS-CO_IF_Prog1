public class Power {
	static double power(int base, int exponent) {
		if (exponent != 1)
			return (base * power(base, exponent -1));
		else return 1;
	}

	public static void main(String[] args) {
		System.out.println(power(2, 3));
	}
}

