/*
 * Write a program to print the area and perimeter of a triangle having 
	sides of 3, 4 and 5 units by creating a class named 'Triangle' without any 
	parameter in its constructor.
 */

package Module_2;

class Triangle {
	int a, b, c;

	public Triangle(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void Area() {
		System.out.println("Area of Triangle is : " + (0.5 * a * b));
	}

	public void Perimeter() {
		System.out.println("Perimeter of Triangle is : " + (a + b + c));
	}

}

public class O014_Area_perimeter_2 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(3, 4, 5);
		t1.Area();
		t1.Perimeter();
	}
}
