
package Oops;

class A1 {
	public void display() {
		System.out.println("running display of a");
	}
}

class B1 extends A1 {

	public void display() {
		System.out.println("running display of B");
	}

}

public class O008_Overiding {
	public static void main(String[] args) {
		B1 b = new B1();
		b.display();
	}
}
