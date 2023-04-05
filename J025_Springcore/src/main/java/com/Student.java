
package com;

import java.util.List;
import java.util.Set;

public class Student {

	int id;
	String name;
	String email;
	List<String> lang;
	Set<String> sub;
	Address adr;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the lang
	 */
	public List<String> getLang() {
		return lang;
	}

	/**
	 * @param lang the lang to set
	 */
	public void setLang(List<String> lang) {
		this.lang = lang;
	}

	/**
	 * @return the sub
	 */
	public Set<String> getSub() {
		return sub;
	}

	/**
	 * @param sub the sub to set
	 */
	public void setSub(Set<String> sub) {
		this.sub = sub;
	}

	/**
	 * @return the adr
	 */
	public Address getAdr() {
		return adr;
	}

	/**
	 * @param adr the adr to set
	 */
	public void setAdr(Address adr) {
		this.adr = adr;
	}

	public void display() {
		System.out.println(id + " " + name + " " + email);
		System.out.println("**************Lang****************");
		for (String l : lang) {
			System.out.println(l);
		}

		System.out.println("**************sub****************");
		for (String s : sub) {
			System.out.println(s);
		}

		adr.display();

	}
}
