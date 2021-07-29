import java.util.Scanner;

public class MultScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n;
        long fakultaet = 1;

		System.out.println("Bitte Zahl eingeben:");
		n = sc.nextInt();

		if (n >= 3) {
			while (n >= 3) {
				fakultaet = fakultaet * n;
				n = n - 1;
			}
			System.out.println(fakultaet);
		} else {
			System.out.println(1);
		}
		sc.close();
	}
}
