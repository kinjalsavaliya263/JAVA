/*
 * Write a Java program to append the specified element to the end of a 
   hash set.
 */

package Module_2;

import java.util.HashSet;

public class O049_HashSet {
	public static void main(String[] args) {
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("Red");
		hSet.add("White");
		hSet.add("Pink");
		hSet.add("Blue");
		hSet.add("Black");
		hSet.add("Gold");
		hSet.add("Green");

		System.out.println(hSet);
	}
}
