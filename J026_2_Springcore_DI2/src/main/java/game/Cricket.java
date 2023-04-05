package game;

import org.springframework.stereotype.Component;

@Component("cricket")
public class Cricket implements Sports {

	public void team() {
		System.out.println("Cricket........");

	}

}
