/*
 *  W.A.J. P to create one thread by extending Thread class in another Class.
 */

package Module_2;

class t1 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("T1 :" + i);
		}
	}
}

public class O032_ThreadClass_To_AnotherClass {
	public static void main(String[] args) {
		t1 t1 = new t1();

		t1.start();
	}
}
