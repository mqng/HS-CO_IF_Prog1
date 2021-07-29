import java.util.Scanner;

public class Vokale {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        char c;
		
        while (true) {
			s = sc.nextLine().toLowerCase();
			int a = 0, e = 0, i = 0, o = 0, u = 0;
			int sz = 0;
			for (int j = 0; j < s.length(); j++) {
				switch (s.charAt(j)) {
				case 'a':
					++a;
					// break;

				case 'e':
					++e;
					break;

				case 'i':
					++i;
					break;

				case 'o':
					++o;
					break;

				case 'u':
					++u;
					break;

				case ' ':
					++sz;
					break;

				case ',':
					++sz;
					break;

				case '.':
					++sz;
					break;

				case '?':
					++sz;
					break;

				case '!':
					++sz;
					break;

				default:
					++sz;
				}
			}
			System.out.println("A: " + a);
			System.out.println("E: " + e);
			System.out.println("I: " + i);
			System.out.println("O: " + o);
			System.out.println("U: " + u);
			System.out.println("SZ: " + sz);
			System.out.println("Continue? (y/N):");
			c = sc.next().charAt(0);
			if (c == 'n' || c == 'N') {
                sc.close();
				System.exit(0);
			}
            
            else if (c == 'y' || c == 'Y') {
            }
            
            else {
                sc.close();
				System.exit(0);
			}

		}
	}
}

