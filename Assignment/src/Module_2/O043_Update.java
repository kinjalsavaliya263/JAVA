/*
 * Write a Java program to update specific array element by given element.
 */

package Module_2;

import java.util.ArrayList;

public class O043_Update {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Colour");
		al.add("Pink");
		al.add("Black");
		al.add("Red");
		al.add("Green");

		al.set(0, "Gold");
		for (String s : al) {
			System.out.println(s);
		}

	}
}
