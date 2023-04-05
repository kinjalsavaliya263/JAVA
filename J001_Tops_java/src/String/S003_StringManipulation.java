
package String;

public class S003_StringManipulation {
	public static void main(String[] args) {
		String str = "sun rises in east";

		// east in rises sun

		String s[] = str.split(" ");
		for (int i = s.length - 1; i >= 0; i--) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
		System.out.println("********************");

		// tsae ni sesir nus
		char ch[] = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println("**********************");

		// nus sesir ni tsae
		// String s1[] = str.split(" ");
		for (int i = 0; i < s.length; i++) {
			char ch1[] = s[i].toCharArray();
			for (int j = ch1.length - 1; j >= 0; j--) {
				System.out.print(ch1[j]);
			}
			System.out.print(" ");
		}

		System.out.println();
		System.out.println("**********************");

		// east rises in sun
		String temp = s[0];
		s[0] = s[s.length - 1];
		s[s.length - 1] = temp;
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
	}
}
