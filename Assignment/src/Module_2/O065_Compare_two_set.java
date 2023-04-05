/*
 * Write a Java program to compare two sets and retain elements which are 
 same on both sets.
 */

package Module_2;

import java.util.HashSet;

public class O065_Compare_two_set {
	public static void main(String[] args) {
		HashSet<String> hSet1 = new HashSet<String>();
		hSet1.add("kinjal");
		hSet1.add("smruti");
		hSet1.add("darshna");
		hSet1.add("chandni");
		hSet1.add("kajal");
		System.out.println("First : " + hSet1);
		HashSet<String> hSet2 = new HashSet<String>();
		hSet2.add("kinjal");
		hSet2.add("smruti");
		hSet2.add("Smruti");
		hSet2.add("dipti");
		hSet2.add("kunu");
		System.out.println("Second : " + hSet2);

		hSet1.retainAll(hSet2);
		System.out.println(hSet1);

	}
}
