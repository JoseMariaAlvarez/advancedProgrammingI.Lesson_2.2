package polygons;

import java.util.ArrayList;

public class Rectangle extends Polygon {
	
	public Rectangle(Point[] vs) {
		super(vs);
	}
	public double area() {
		return base()*height();
	}
	public double base() {
		return vertices[0].distance( 
					vertices[1]);
	  }
	  public double height() {
		return vertices[1].distance( 
					vertices[2]);
	  }
  public String toString() {return null;}
}