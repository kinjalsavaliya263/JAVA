/*
 * 	W.A.J.P to find the second most frequent character in a given string. The 
	given string is: successes The second most frequent char in the string is: c
 */

package Module_2;

public class O007_Most_Frequent {
	public static void main(String[] args) {
		String s = "successes";
		int count[] = new int[256];
		int i;
		for (i = 0; i < s.length(); i++) {
			(count[s.charAt(i)])++;
		}

		// Traverse through the count[] and find
		// second highest element.
		int first = 0, second = 0;
		for (i = 0; i < 256; i++) {

//			  If current element is smaller than first then update both first and second

			if (count[i] > count[first]) {
				second = first;
				first = i;
			}

//			  If count[i] is in between first and second then update second

			else if (count[i] > count[second] && count[i] != count[first])
				second = i;
		}
		System.out.println("Second highest element is : " + (char) first);
		System.out.println("Second highest element is : " + (char) second);
	}
}
