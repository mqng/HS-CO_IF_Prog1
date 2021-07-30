import java.util.Scanner;

public class Temperature {

	public static double toCelsius(double fahrenheit) {
		return 5.0 / 9.0 * (fahrenheit - 32);
	}

	public static double toFahrenheit(double celsius) {
		return 9.0 / 5.0 * celsius + 32;
	}

	public static void main(String[] args) {
        double temp;
        Scanner sc = new Scanner(System.in);

		System.out.print("Temp in Celsius: ");
		temp = sc.nextDouble();
		System.out.println(Temperature.toFahrenheit(temp));

		System.out.print("Temp in Fahrenheit: ");
	    temp = sc.nextDouble();
		System.out.println(Temperature.toCelsius(temp));

        sc.close();
	}
}

