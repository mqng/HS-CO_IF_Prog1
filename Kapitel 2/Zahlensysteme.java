import java.util.Scanner;

public class Zahlensysteme {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dezimale Zahl eingeben:");
		int dez = sc.nextInt();
		System.out.println("Hex: " + Integer.toHexString(dez));
		System.out.println("Binär: " + Integer.toBinaryString(dez));

		System.out.println("Hexidezimale Zahl eingeben:");
		String hexin = sc.next();
		int hexout = Integer.parseInt(hexin, 16);
		System.out.println("Dezimal: " + hexout);
		System.out.println("Binär:" + Integer.toBinaryString(hexout));

		System.out.println("Binäre Zahl eingeben:");
		String binin = sc.next();
		int binout = Integer.parseInt(binin, 2);
		System.out.println("Dezimal:" + binout);
		System.out.println("Hex:" + Integer.toHexString(binout));

		System.out.println("Octale Zahl eingeben:");
		String octain = sc.next();
		int octaout = Integer.parseInt(octain, 8);
		System.out.println("Binär: " + octaout);
		System.out.println("Hex:" + Integer.toHexString(octaout));
		sc.close();
	}
}
