/*
 * Write a Java program to convert a hash set to an array.
 */
package Module_2;

import java.util.HashSet;

public class O059_HashSet_to_array {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("kinjal");
		set.add("smruti");
		set.add("darshna");
		set.add("chandni");
		set.add("dipti");
		set.add("kajal");
		System.out.println("original HashSet : " + set);

		String[] N_array = new String[set.size()];
		set.toArray(N_array);
		System.out.println("New Array : ");

		for (String string : N_array) {
			System.out.println(string);
		}
	}
}
