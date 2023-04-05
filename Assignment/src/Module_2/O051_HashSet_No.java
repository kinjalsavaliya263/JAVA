/*
 *  Write a Java program to get the number of elements in a hash set.
 */

package Module_2;

import java.util.HashSet;

public class O051_HashSet_No {
	public static void main(String[] args) {
		HashSet<Integer> hS = new HashSet<Integer>();
		hS.add(10);
		hS.add(50);
		hS.add(80);
		hS.add(90);
		hS.add(70);
		hS.add(45);
		hS.add(75);
		hS.add(15);
		hS.add(64);
		hS.add(78);
		hS.add(50);

		System.out.println(hS);

	}
}
