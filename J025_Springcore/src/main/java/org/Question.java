
package org;

import java.util.List;

public class Question {

	int qid;
	String qname;
	List<Answer> ans;

	/**
	 * @param qid
	 * @param qname
	 * @param ans
	 */
	public Question(int qid, String qname, List<Answer> ans) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.ans = ans;
	}

	public void display() {
		System.out.println(qid + " " + qname);

		for (Answer a : ans) {
			a.display();
		}
	}
}
