/*
 * W.A.J.P to create 2 threads and execute that threads by providing sleep 
time as 2000ms and check the execution.
 */

package Module_2;

class Th1 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
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

public class O033_Thread_Sleep {
	public static void main(String[] args) {

		Th1 t1 = new Th1();
		Th1 t2 = new Th1();

		t1.start();
		t2.start();

	}
}
