package de.zerocode.testing;

import de.zerocode.util.Circle;
import de.zerocode.util.Shapes;
import de.zerocode.util.Triangle;

public class PolymorphismTesting {
	public static void main(String[] args) {
		Shapes shape = new Triangle();
		System.out.println(shape.getArea());
		
		Triangle triangle = new Circle();
		System.out.println(triangle.getArea());
		System.out.println(triangle.getArea(5, 7));
	}

}
