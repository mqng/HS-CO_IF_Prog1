public class Minimum {
	static int getMin(int[] array, int a, int n) {	
		if (a == array.length)
			return n;
		return Math.min(n, getMin(array, a+1, array[a] < n ? array[a]: n));     
	}

	public static void main(String[] args) {
		int array[]= {1,5,9,12,-3,89,18,23,4,-6};
		System.out.println(getMin(array,0,array[0]));
	}
}
