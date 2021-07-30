import java.util.*;

public class Sort {    

    public static void main(String[] args) {

        int[] a = {2000, 2, 45, 34, 100000, 345, 56,
                78, 99, 756, 999, 0, 666, 2345, 7492, 22};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
