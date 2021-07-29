public class RectangleArea{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int a = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);
		int c = Integer.parseInt(args[3]);
		
        int x =  a-n;
		int y = c-b;
		int area = x*y;
		
        System.out.println(area);
	}
}
