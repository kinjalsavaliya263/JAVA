package com;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Square extends SimpleTagSupport {
	private int number;

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public void doTag() throws JspException, IOException {
		getJspContext().getOut().write("Square of " + number + " is" + number * number);

	}
}