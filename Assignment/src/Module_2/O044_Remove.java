/*
 *  Write a Java program to remove the third element from an array list.
 */

package Module_2;

import java.util.ArrayList;

public class O044_Remove {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Colour");
		al.add("Pink");
		al.add("Black");
		al.add("Red");
		al.add("Green");

		al.remove(0);
		for (String s : al) {
			System.out.println(s);
		}

	}
}
