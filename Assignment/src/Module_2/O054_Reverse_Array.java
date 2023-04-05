/*
 *  Write a Java program to reverse elements in an array list. 
 */

package Module_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class O054_Reverse_Array {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(50);
		li.add(80);
		li.add(70);
		li.add(90);
		li.add(20);
		li.add(65);
		li.add(20);
		System.out.println("First : " + li);
		Collections.reverse(li);
		System.out.println("Second : " + li);

	}
}
