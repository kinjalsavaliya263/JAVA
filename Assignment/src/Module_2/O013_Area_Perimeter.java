/*
 * Create a class named 'Rectangle' with two data members 'length' and 
	'breadth' and two methods to print the area and perimeter of the 
	rectangle respectively. Its constructor having parameters for length and 
	breadth is used to initialize the length and breadth of the rectangle. Let 
	class 'Square' inherit the 'Rectangle' class with its constructor having a 
	parameter for its side (suppose s) calling the constructor of its parent class 
	as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.
 */

package Module_2;

class Rectangle {
	int length;
	int breadth;

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public void Area() {
		System.out.println("Area of Rectangle is : " + (length * breadth));
	}

	public void perimeter() {
		System.out.println("Perimeter of Rectangle is : " + (2 * (length + breadth)));
	}
}

public class O013_Area_Perimeter {
	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(10, 20);
		rectangle.Area();
		rectangle.perimeter();

	}
}
