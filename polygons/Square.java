package polygons;

public class Square extends Polygon {

	public Square(Point[] vs) {
		super(vs);
	}
	public double area() {
		return side()*side();
	}
	public double side() {
		return vertices[0].distance( 
				vertices[1]);
	}
	public String toString() {return null;}
}