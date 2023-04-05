/*
 *  Write a Java program to sort a given array list.
 */

package Module_2;

import java.util.Iterator;
import java.util.TreeSet;

public class O046_Sort {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(50);
		set.add(80);
		set.add(90);
		set.add(110);
		set.add(174);
		set.add(1);
		set.add(0);

		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
