/*
 * Write a Java program to retrieve an element (at a specified index) from a 
	given array list.
 */

package Module_2;

import java.util.ArrayList;

public class O042_Retrieve {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Colour");
		al.add("Pink");
		al.add("Black");
		al.add("Red");
		al.add("Green");

//		al.get(2);

		System.out.println(al.get(2));

	}
}
