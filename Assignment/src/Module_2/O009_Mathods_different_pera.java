/*
 * 	Create a class to print an integer and a character with two methods having 
	the same name but different sequence of the integer and the character 
	parameters. For example, if the parameters of the first method are of the 
	form (int n, char c), then that of the second method will be of the form 
	(char c, int n).
 */

package Module_2;

class Demo {
	public void display(int n, char c) {
		System.out.println("Method 1 calling...." + n + " , " + c);
	}

	public void display(char c, int n) {
		System.out.println("Method 1 calling...." + c + " , " + n);
	}
}

public class O009_Mathods_different_pera {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.display('K', 26);
		d1.display(20, 'S');
	}
}
