/*
 * Write a Java program to iterate through all elements in an array list.
 */

package Module_2;

import java.util.ArrayList;
import java.util.Iterator;

public class O040_Iterate {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Colour");
		al.add("Pink");
		al.add("Black");
		al.add("Red");
		al.add("Green");

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
