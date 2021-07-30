import java.util.Scanner;

public class Tabellenkalkulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Spaltenanzahl: ");
		int spalte = sc.nextInt();
		System.out.print("Zeilenanzahl: ");
		int zeile = sc.nextInt();
		int a[][] = new int[zeile][spalte];
		int sumCol, sumRow;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++)
				a[i][j] = (int) (Math.random() * 9);
		}

		for (int i = 0; i < a.length; i++) {
			sumRow = 0;
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "  ");
				sumRow = sumRow + a[i][j];
			}
			System.out.print("// " + sumRow);
			System.out.println();
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("= =");
		}
		System.out.println();
		
		for (int i = 0; i < a[0].length; i++) {
			sumCol = 0;
			for (int j = 0; j < a.length; j++) {
				sumCol = sumCol + a[j][i];
			}
			System.out.print(sumCol + " ");
		}
		sc.close();
	}
}

