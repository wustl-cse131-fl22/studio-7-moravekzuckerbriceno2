package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;


	public Rectangle(double dimLength, double dimWidth) {
		length = dimLength;
		width = dimWidth;
	}

	public double Area() {
		double CalArea = length * width;
		return CalArea;
	}
	public double Perimeter() {
		double CalPerimeter = (2*length) + (2*width);
		return CalPerimeter;
	}
	public boolean Compare(Rectangle R) {
		if (this.Area() > R.Area()) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean Square(double length, double width) {
		if (length == width) {
			return true;
		}
		else {
			return false;
		}
	}



}

//	public static void Draw () {
//		StdDraw.setPenColor(Color.BLACK);
//		StdDraw.rectangle(0.5, 0.5, length, width);



public static void main (String[] args) {

}
}
