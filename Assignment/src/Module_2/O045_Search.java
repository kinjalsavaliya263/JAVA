/*
 *  Write a Java program to search an element in an array list.
 */

package Module_2;

import java.util.ArrayList;

public class O045_Search {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Colour");
		al.add("Pink");
		al.add("Black");
		al.add("Red");
		al.add("Green");

		if (al.contains("Red")) {
			System.out.println("Found The Element");
		} else {
			System.out.println("Not Found The Element");

		}

	}
}
