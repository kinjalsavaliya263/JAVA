/*
 * W.A.J.P to start the same Thread twice by calling start () method twice.
Test ThreadTwice1 t1=new TestThreadTwice1(); 
t1.start ();
t1.start ();
 */

package Module_2;

class Th2 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(currentThread().getName() + " : " + i);
		}
	}
}

public class O034_Thread_Twice {
	public static void main(String[] args) {

		Th2 t1 = new Th2();

		t1.start();
		t1.start();
	}
}
