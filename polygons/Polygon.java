package polygons;

import java.util.ArrayList;

public abstract class Polygon {
	protected final Point[] vertices;
	
	public Polygon(Point[] vs) {
		 vertices = vs;
	}
	public void move(double a, double b) {
		for(Point pto : vertices){ pto.move(a,b); }
	}
	public double perimeter() { 
		Point ant = vertices[0];
		double res = 0.0d;
		for(Point pnt : vertices) {
			 res += pnt.distance(ant);
			 ant = pnt;
		}
		return res;
	}
		
	abstract public double area();  // We don’t know how to compute it

}
