/*
 * Write a Java program to iterate through all elements in a hash list.
 */

package Module_2;

import java.util.HashSet;
import java.util.Iterator;

public class O050_HashSet_Iterate {
	public static void main(String[] args) {
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("Red");
		hSet.add("White");
		hSet.add("Pink");
		hSet.add("Blue");
		hSet.add("Black");
		hSet.add("Gold");
		hSet.add("Green");

		Iterator<String> itr = hSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}
}
