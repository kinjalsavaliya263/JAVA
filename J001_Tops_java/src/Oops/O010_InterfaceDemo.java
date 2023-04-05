
package Oops;

interface I1 {
	int a = 10;

	public void display();
}

interface I2 {

//	public void display();

	public void run();
}

class k {

}

class InterImpl extends k implements I1, I2 {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		System.out.println("display calling...");

	}

}

public class O010_InterfaceDemo {
	public static void main(String[] args) {
//		final int a = 20;
//		System.out.println(a);
	}
}
