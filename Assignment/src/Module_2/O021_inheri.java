/*
 * Create a class named 'Shape' with a method to print "This is this is shape". 
 * Then create two other classes named 'Rectangle', 'Circle' inheriting the 
	Shape class, both having a method to print "This is rectangular shape" and 
	"This is circular shape" respectively. 
 * Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle". 
 * Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.

 */

package Module_2;

class Shape1 {
	public void printS() {
		System.out.println("This is Shape.....");
	}
}

class Rectangle1 extends Shape1 {
	public void printR() {
		System.out.println("This is rectangular shape.....");
	}
}

class Square extends Rectangle1 {
	public void print() {
		System.out.println("Square is a rectangle......");
	}
}

class Circle1 extends Shape1 {
	public void print() {
		System.out.println("This is Circle shape.....");
	}
}

public class O021_inheri {
	public static void main(String[] args) {
		Square s1 = new Square();
//		s1.print();
		s1.printS();
		s1.printR();
	}
}
