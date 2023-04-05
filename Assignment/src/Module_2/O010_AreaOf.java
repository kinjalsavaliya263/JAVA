/*
 * 	Create a class to print the area of a square and a rectangle. The class has 
	two methods with the same name but different number of parameters. 
	The method for printing area of a rectangle has two parameters which are 
	length and breadth respectively while the other method for printing area 
	of square has one parameter which is side of square.
 */

package Module_2;

class Area {
	public void Square(double side) {
		System.err.println("Area of Square is : " + (side * side));
	}

	public void Rectangle(double length, double breadth) {
		System.out.println("Area of Rectangle is : " + (length * breadth));
	}
}

public class O010_AreaOf {
	public static void main(String[] args) {
		Area a1 = new Area();
		a1.Square(5);
		a1.Rectangle(10, 20);
	}
}
