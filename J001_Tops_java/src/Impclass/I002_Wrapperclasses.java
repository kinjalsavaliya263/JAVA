
package Impclass;

public class I002_Wrapperclasses {
	public static void main(String[] args) {
		int i = 10;
		// boxing
//		Integer j = new Integer(i);
		// auto boxing
		Integer k = i;
		Integer x = 20;
		// unboxing
		int y = x.intValue();
		// autounboxing
		int z = x;

		// int l=null;
		// Integer l1 =null
//		System.out.println(j);
		System.out.println(k);
		System.out.println(y);
		System.out.println(z);
	}
}
