/*
 * Write a Java program to copy one array list into another. 
 */

package Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class O047_Copy_Array {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Colour");
		al.add("Pink");
		al.add("Black");
		al.add("Red");
		al.add("Green");

		ArrayList<String> al1 = new ArrayList<String>();
		al.add("Colour1");
		al.add("Pink1");
		al.add("Black1");
		al.add("Red1");
		al.add("Green1");

		Collections.copy(al, al1);

		for (String s : al) {
			System.out.println(s);
		}

	}
}
