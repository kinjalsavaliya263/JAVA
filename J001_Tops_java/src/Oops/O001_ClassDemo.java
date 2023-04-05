
package Oops;

class Pen {
	// data member
	static int price = 10;
	String color = "Red";
	String company = "Cello";

	// function member
	public void toWrite() {
		System.out.println(price + " " + color + " " + company);
	}

	public static void display() {
		System.out.println("running disply method");
	}

}

public class O001_ClassDemo {
	public static void main(String[] args) {

		Pen.price = 5000;

		Pen p = new Pen();
		// p.price=100;
		p.color = "blue";
		p.toWrite();

		Pen p1 = new Pen();
		// p1.price = 500;
		p1.toWrite();

		Pen p2 = new Pen();
		p2.color = "black";
		p2.toWrite();

		Pen.display();
	}
}
