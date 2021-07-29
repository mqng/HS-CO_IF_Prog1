import java.util.Scanner;

public class DreierSumme {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int sum = 0;

		if (n % 3 == 0) {
			for (int i = 0; i <= n; i += 3) {
				System.out.print(i + " ");				
				sum += i;
			}
			System.out.println("\nSumme = " + sum);
			
		}
        else if (n < 3) {
			System.out.println("Summe = 0");
			
		}
        else {
            do
                n--;
            while (n % 3 != 0);

			for (int i = 0; i <= n; i += 3) {
				System.out.print(i + " ");
				sum += i;
			}
			
			System.out.println("\nSumme = " + sum);
		}
		sc.close();
	}
}

