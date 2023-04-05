/*
 * W.A.J.P to create 2 threads and make one thread as Daemon Thread by 
	using set Daemon () method of Thread class and check whether the thread 
	is set daemon or not by using is Daemon () method.
	TestDaemonThread2 t1=new TestDaemonThread2(); 
	TestDaemonThread2 t2=new TestDaemonThread2(); t1.start();
	t1.setDaemon(true);//will throw exception here t2.start();
 */

package Module_2;

class Th extends Thread {
	public void Daemon() {

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Th1 : " + i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

public class O036_Daemon_Thread {
	public static void main(String[] args) {

		Th th1 = new Th();
		Th th2 = new Th();

		th1.start();

		th2.start();

	}
}
