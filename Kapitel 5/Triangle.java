import java.util.Scanner;

public class Triangle {

	public static double hypotenuse(double a, double b) {
		return Math.sqrt(a*a + b*b);
	}	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double hyp = hypotenuse(a, b);
		System.out.println("Hypotenuse: " + hyp);
        sc.close();
	}
}

