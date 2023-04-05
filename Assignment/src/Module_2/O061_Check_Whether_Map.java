/*
 *  Write a Java program to check whether a map contains key-value mappings (empty) or not.
 */
package Module_2;

import java.util.HashMap;

public class O061_Check_Whether_Map {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "kinjal");
		map.put(2, "smruti");
		map.put(3, "darshna");
		map.put(4, "chandni");

		boolean result = map.isEmpty();
		System.out.println("First Result : " + result);

		map.clear();
		result = map.isEmpty();
		System.out.println("Second Result : " + result);
	}
}
