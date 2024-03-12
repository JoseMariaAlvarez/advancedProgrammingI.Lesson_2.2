package polygons;

import java.util.ArrayList;

public abstract class Polygon {
	protected ArrayList<Point> vertices;
	
	public Polygon(ArrayList<Point> vs) {
		 vertices = vs;
	}
	public void move(double a, double b) {
		for(Point pto : vertices){ pto.move(a,b); }
	}
	public double perimeter() { 
		Point ant = vertices.get(0);
		double res = 0.0d;
		for(Point pnt : vertices) {
			 res += pnt.distance(ant);
			 ant = pnt;
		}
		return res;
	}
		
	abstract public double area();  // We don’t know how to compute it
	
	public double base() {
		  return vertices.get(0).distance( 
	                  vertices.get(1));
		}
		public double height() {
		  return vertices.get(1).distance( 
	                  vertices.get(2));
		}

}
