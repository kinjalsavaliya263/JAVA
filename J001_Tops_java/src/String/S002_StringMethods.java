
package String;

public class S002_StringMethods {
	public static void main(String[] args) {
		String s = "Sun Rise In East";

		System.out.println("Length: " + s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(5));
		System.out.println(s.indexOf('n'));
		System.out.println(s.lastIndexOf('n'));
		System.out.println(s.substring(5));
		System.out.println(s.substring(5, 13));
		System.out.println(s.trim());
		System.out.println(s.endsWith("u"));
		System.out.println(s.startsWith("s"));

		String s1 = "java";
		String s2 = "Java";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}
