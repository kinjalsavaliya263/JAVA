/*
 * W.A.J. P to create one thread by implementing Runnable interface in 
Class.
 */

package Module_2;

class TR1 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("TR1 :" + i);
		}

	}

}

class TR2 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("TR2 :" + i);
		}

	}

}

public class O031_Thread_Runnable_Interface {
	public static void main(String[] args) {
		TR1 tr1 = new TR1();
		TR2 tr2 = new TR2();

		Thread t1 = new Thread(tr1);
		Thread t2 = new Thread(tr2);

		t1.start();
		t2.start();

	}
}
