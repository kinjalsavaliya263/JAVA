/*
 * Write a Java program to insert an element into the array list at the first 
	position.
 */

package Module_2;

import java.util.ArrayList;

public class O041_First_Position {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Colour");
		al.add("Pink");
		al.add("Black");
		al.add("Red");
		al.add("Green");

		al.add(1, "Gold");

		for (String s : al) {
			System.out.println(s);
		}
	}
}
