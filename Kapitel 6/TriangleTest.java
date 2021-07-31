public class TriangleTest {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(new Point(-1, 0), new Point(5, 2), new Point(1, 0));
		System.out.println(t1.area());
		System.out.println(t1.perimeter());
		System.out.println(t1.lowerLeft());
		System.out.println(t1.upperRight());
	}
}
