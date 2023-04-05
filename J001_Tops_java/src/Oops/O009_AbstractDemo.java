
package Oops;

abstract class Abs {
	public abstract void display();

	public void run() {
		System.out.println("running run");
	}
}

class AbsImpl extends Abs {
	public void display() {
		System.out.println("running display....");
	}
}

public class O009_AbstractDemo {
	public static void main(String[] args) {
		Abs a = new AbsImpl();
		a.display();

		AbsImpl i = new AbsImpl();
		i.display();
		i.run();
	}
}
