
package Oops;

class A {
	int a = 10;

	public void display() {
		System.out.println("running display of class A....");
	}
}

class B extends A {
	int a = 50;

	public void run() {
		System.out.println("a : " + super.a);
		System.out.println("a : " + a);
		System.out.println("Running run Method class .....");
	}

	public void display() {
		System.out.println("running display of class B....");
		super.display();
	}
}

class C extends B {

}

public class O004_InheritanceDemo {

	public static void main(String[] args) {
		B b = new B();
		b.run();
		b.display();

//		A a = new A();
	}
}
