public class Fakultaet {
	static double fakultät(int n) {
		if (n == 0)
			return 1;
		return fakultät(n-1) *n;
	}
	public static void main(String[] args) {
		System.out.println(fakultät(4));
	}
}
