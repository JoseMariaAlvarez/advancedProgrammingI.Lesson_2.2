package polygons;

import java.util.ArrayList;

public class Square extends Polygon {

	public Square(ArrayList<Point> vs) {
		super(vs);
	}
	public double area() {
		return side()*side();
	}
	public double side() {
		return vertices.get(0).distance( 
				vertices.get(1));
	}
	public String toString() {return null;}
}