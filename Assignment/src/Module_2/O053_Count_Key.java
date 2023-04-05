/*
 *  Write a Java program to count the number of key-value (size) mappings 
	in a map.
 */

package Module_2;

import java.util.HashMap;

public class O053_Count_Key {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(10, "Kinjal");
		hm.put(80, "Smruti");
		hm.put(50, "Darshna");
		hm.put(40, "Chandni");
		hm.put(30, "Kajal");

		System.out.println(hm.size());
	}
}
