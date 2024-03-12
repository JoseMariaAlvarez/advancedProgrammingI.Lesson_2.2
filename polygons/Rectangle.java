package polygons;

import java.util.ArrayList;

public class Rectangle extends Polygon {
	
	public Rectangle(ArrayList<Point> vs) {
		super(vs);
	}
	public double area() {
		return base()*height();
	}
	public double base() {
	  return vertices.get(0).distance( 
                  vertices.get(1));
	}
	public double height() {
	  return vertices.get(1).distance( 
                  vertices.get(2));
	}
	public String toString() {return null;}
}