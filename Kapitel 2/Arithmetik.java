import java.util.Scanner;

public class Arithmetik {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x,y;

		x = sc.nextDouble();
		y = sc.nextDouble();

		double z1 = x*x*y*y - 4*x*y + 4;
		double z2 = ((1+x*y)*(1+x*y) )/ (1+ Math.pow((1+x*y), 4));
		double z3 = x*y + (3- x)*y-y; 
		double z4 = 2*y;
		
		System.out.println("1)" + z1);
		System.out.println("2)" + z2);
		System.out.println("3)" + z3);
		System.out.println("4)" + z4);

		sc.close();
	}
}

