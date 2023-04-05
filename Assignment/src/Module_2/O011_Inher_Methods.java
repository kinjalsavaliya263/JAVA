/*
 * Create a class with a method that prints "This is a parent class" and its 
	subclass with another method that prints "This is child class". Now, create 
	an object for each of the class and call
	 	1 - method of parent class by object of parent class 
	 	2 - method of child class by object of child class 
	 	3 - method of parent class by object of child class

 */

package Module_2;

class parent {
	public void DisParent() {
		System.out.println("This is a parent class.....");
	}
}

class child extends parent {
	public void DisChild() {
		System.out.println("This is child class....");
	}
}

public class O011_Inher_Methods {
	public static void main(String[] args) {
		parent p1 = new parent();
		p1.DisParent();

		child c1 = new child();
		c1.DisChild();

		c1.DisParent();
	}
}
