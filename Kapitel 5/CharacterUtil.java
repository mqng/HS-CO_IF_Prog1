public class CharacterUtil {

	static boolean vertausche(char[] s, char[] t) {
		boolean laengeGleich = false;
		if (t.length == s.length) {
			char[] c = new char[t.length];
			for (int i = 0; i < t.length; i++) {
				c[i] = t[i];
				t[i] = s[i];
				s[i] = c[i];

			}
			return true;
		}
		return laengeGleich;
	}

	static boolean vertausche2(char[] s, char[] t) {
		boolean laengeGleich = false;
		if (t.length == s.length) {
			s = t;
			t = s;
			return true;
		}
		return laengeGleich;
	}

	public static void main(String[] args) {
		char[] s = { 'S', 'O', 'R', 'T', 'B', 'Y' };
		char[] t = { 'B', 'U', 'B', 'B', 'L', 'E' };
		vertausche2(s, t);
		System.out.println(s);
		System.out.println(t);

	}
}

