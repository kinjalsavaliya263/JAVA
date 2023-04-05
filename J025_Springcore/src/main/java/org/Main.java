/**
 * 
 */
package org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kinjal
 *
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext1.xml");
		Question que = context.getBean("que", Question.class);
		que.display();
	}
}
