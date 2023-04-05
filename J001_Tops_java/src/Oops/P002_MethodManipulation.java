
package Oops;

class MCalc {
	public void display() {
		System.out.println("running display.....");
	}

	public void add(int a, int b) {
		System.out.println("Addition is : " + (a + b));
	}

	public int square(int i) {
		int sq = i * i;
		return sq;
	}

	public void addArray(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Addition of array is : " + sum);
	}

	public int[] revArray(int a[]) {
		int k[] = new int[a.length];
		int c = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			k[c] = a[i];
			c++;
		}
		return k;
	}

	public void call(int... a) {

	}
}

public class P002_MethodManipulation {
	public static void main(String[] args) {
		MCalc m = new MCalc();
		m.display();
		m.add(10, 20);

		int r = m.square(20);
		System.out.println("square is : " + r);
		System.out.println(m.square(2));

		int a[] = { 10, 20, 30, 40, 50 };
		m.addArray(a);

		int rev[] = m.revArray(a);
		for (int i = 0; i < rev.length; i++) {
			System.out.println(rev[i]);
		}
		m.call(10, 20, 30, 40, 50, 60);
	}
}
