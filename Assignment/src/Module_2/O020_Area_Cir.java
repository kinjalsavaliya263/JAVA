/*
 * We have to calculate the area of a rectangle, a square and a circle. Create 
	an abstract class 'Shape' with three abstract methods namely 
	'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' 
	taking one parameter each. The parameters of 'RectangleArea' are its 
	length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' 
	is its radius. Now create another class 'Area' containing all the three 
	methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the 
	area of rectangle, square and circle respectively. Create an object of class 
	'Area' and call all the three methods. 
 */
package Module_2;

abstract class Shape {
	public abstract void RectangleArea();

	public abstract void SquareArea();

	public abstract void CircleArea();

}

class Area1 {
	public void RectangleArea(int length, int breadth) {
		System.out.println("Area of Rectangle : " + (length * breadth));
	}

	public void SquareArea(int side) {
		System.out.println("Area of Square : " + (side * side));
	}

	public void CircleArea(int radius) {
		System.out.println("Area of Circle : " + (2 * 3.14 * radius));
	}
}

public class O020_Area_Cir {
	public static void main(String[] args) {
		Area1 a1 = new Area1();
		a1.RectangleArea(4, 5);
		a1.SquareArea(5);
		a1.CircleArea(5);
	}
}
