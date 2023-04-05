
package String;

public class S001_FristPract {
	public static void main(String[] args) {
		// String s = "pramod";
		// String s1 = new String("kinjal");
		// String s2 = s.concat(" suryvanshi");
		// System.out.println(s2);

		String s1 = new String("pramod");
		String s2 = new String("kinjal");
		String s3 = new String("pramod");

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);

		System.out.println("******************************");

		String str1 = "pramod";
		String str2 = "kinjal";
		String str3 = "pramod";

		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1 == str3);
	}
}
