
package Basic;

import Oops.O006_Modifier;

public class Demo extends O006_Modifier {
	public void run() {
		System.out.println(a);
	}

	public static void main(String[] args) {
//		System.out.println(a);
		O006_Modifier o = new O006_Modifier();
		// o.a=50;
		// o.b=50;
		o.display();
	}
}
