import java.util.Scanner;

public class MagQuadrat {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
        do {
			System.out.println("Bitte n eingeben (n ungerade, 2 < n < 10): ");
			n = sc.nextInt();
		}
		while (n % 2 == 0 || n < 3 || n > 9);

		int[][] quad = new int[n][n];
		int zeile = n / 2, spalte = (n / 2) + 1, m = 0;
		do {
			m++;
			quad[zeile][spalte] = m;
			zeile--;
			spalte++;
			zeile = (zeile + n) % n;
			spalte %= n;
			if (quad[zeile][spalte] != 0) {
				zeile++;
				spalte++;
				zeile %= n;
				spalte %= n;
			}
		} while (m < n * n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				m = quad[i][j];
				if (m < 10)
					System.out.print(" ");
				if (m < 100)
					System.out.print(" ");
				System.out.print(" " + m);
			}
			System.out.println(" ");
		}
		sc.close();
	}
}

