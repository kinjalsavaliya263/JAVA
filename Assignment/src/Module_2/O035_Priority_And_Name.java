/*
 * W.A.J.P to set the user defined name, priority and get that name and 
	priority for 2 threads using setName (), setPriority (), getName (), 
	getPriority () methods of Thread class.
	TestMultiPriority1 m1=new TestMultiPriority1 (); TestMultiPriority1 
	m2=new TestMultiPriority1 ();
	m1.setName (“mythread-1”); 
	m2.setName (“mythread- 2”); 
	m1.setPriority (Thread.MIN_PRIORITY);
	m2.setPriority (Thread.MAX_PRIORITY); 
	m1.start ();
	m2.start ();

 */

package Module_2;

class t2 extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("T2 : " + i);
		}
	}
}

class t3 extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("T3 : " + i);
		}
	}
}

public class O035_Priority_And_Name {
	public static void main(String[] args) {
		t2 m1 = new t2();
		t3 m2 = new t3();
		m1.setName("mythread-1");
		m2.setName("mythread-2");
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MAX_PRIORITY);
		m1.start();
		m2.start();
	}
}
