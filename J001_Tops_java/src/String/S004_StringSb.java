
package String;

public class S004_StringSb {
	public static void main(String[] args) {
		double startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("hello");
		for (int i = 0; i < 100000; i++) {
			sb.append("Tops");
		}
		double endTime = System.currentTimeMillis();

		double startTime1 = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("hello");
		for (int i = 0; i < 100000; i++) {
			sb.append("Tops");
		}
		double endTime1 = System.currentTimeMillis();

		System.out.println("Buffer :" + (endTime - startTime));
		System.out.println("Builder :" + (endTime1 - startTime1));

	}
}
