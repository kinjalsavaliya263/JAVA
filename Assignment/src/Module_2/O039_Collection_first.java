/*
 * Write a Java program to create a new array list, add some colours (string) 
	and print out the collection.
 */

package Module_2;

import java.util.ArrayList;

public class O039_Collection_first {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Colour");
		al.add("Pink");
		al.add("Black");
		al.add("Red");
		al.add("Green");

		for (String s : al) {
			System.out.println(s);
		}

	}
}
