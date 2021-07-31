public class Triangle {
	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;

	}

	public Point getA() {
		return a;
	}

	public Point getB() {
		return b;
	}

	public Point getC() {
		return c;
	}

	public double perimeter() {
		return Math.sqrt(Math.pow((b.getX() - a.getX()), 2) * Math.pow((b.getY() - a.getY()), 2))
				+ Math.sqrt(Math.pow((c.getX() - b.getX()), 2) * Math.pow((c.getY() - b.getY()), 2))
				+ Math.sqrt(Math.pow((c.getX() - a.getX()), 2) * Math.pow((c.getY() - c.getY()), 2));

	}

	public double area() {
		double peri = Math.abs(
				(a.getX() - c.getX()) * (b.getY() - a.getY()) - (a.getX() - b.getX()) * (c.getY() - a.getY())) * 0.5;
		return peri;
	}

	public Point lowerLeft() {
		return new Point(Math.min(a.getX(), Math.min(b.getX(), c.getX())),
				Math.min(a.getY(), Math.min(b.getY(), c.getY())));
	}

	public Point upperRight() {
		return new Point(Math.max(a.getX(), Math.max(b.getX(), c.getX())),
				Math.max(a.getY(), Math.max(b.getY(), c.getY())));
	}	
}
