
package Oops;

class Demo {
	static int count = 0;

	Demo() {
		count++;
		System.out.println("cons callling...." + count);
	}
}

public class O002_ObjectCount {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		Demo d4 = new Demo();

	}
}
