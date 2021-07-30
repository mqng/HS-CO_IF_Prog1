public class Anweisungen {
    
    public static void main(String[] args) {
		final int[] arraysize = new int[10];
		float[] fractions = new float[arraysize.length];
		fractions[3] = 4.5f;
		fractions[arraysize.length - 1] = 5.3f;
		float total = 0;

		for (int i = 0; i < fractions.length; i++) {
			total = total + fractions[i];

		}
		System.out.println(total);
	}
}
