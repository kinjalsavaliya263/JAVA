/**
 * 
 */
package game;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Kinjal
 *
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Sportsconfig.class);

		Cricket c1 = context.getBean("cricket", Cricket.class);
		c1.team();

	}
}
