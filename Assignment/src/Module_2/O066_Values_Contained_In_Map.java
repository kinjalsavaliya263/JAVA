/*
 * Write a Java program to get a collection view of the values contained in 
this map.
 */

package Module_2;

import java.util.HashMap;

public class O066_Values_Contained_In_Map {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "kinjal");
		map.put(2, "Smruti");
		map.put(3, "chandni");
		map.put(4, "Darshna");
		System.out.println(map.values());
	}
}
