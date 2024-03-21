package polygons;

public class PolygonTest {

	public static void main(String[] args) {
		Point [] arrPoint = { new Point(0.0, 0.0), new Point(0.0, 1.0),
				new Point(1.0, 1.0), new Point(1.0, 0.0)};
		Polygon[] arrPol = { new Rectangle(arrPoint), 
				             new Square(arrPoint)};
		for (Polygon plgn: arrPol) {
			System.out.println(plgn.area());
		}

	}

}
