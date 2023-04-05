
package model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "student1")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int stid;
	String stname;

	@ManyToMany
	@JoinTable(name = "std_sub1", joinColumns = @JoinColumn(name = "stid"), inverseJoinColumns = @JoinColumn(name = "subid"))

	List<Subject> sub;

	/**
	 * @return the stid
	 */
	public int getStid() {
		return stid;
	}

	/**
	 * @param stid the stid to set
	 */
	public void setStid(int stid) {
		this.stid = stid;
	}

	/**
	 * @return the stname
	 */
	public String getStname() {
		return stname;
	}

	/**
	 * @param stname the stname to set
	 */
	public void setStname(String stname) {
		this.stname = stname;
	}

	/**
	 * @return the sub
	 */
	public List<Subject> getSub() {
		return sub;
	}

	/**
	 * @param sub the sub to set
	 */
	public void setSub(List<Subject> sub) {
		this.sub = sub;
	}

	public void addSubject(Subject s) {
		if (sub == null) {
			sub = new ArrayList<Subject>();
		}
		sub.add(s);
	}
}
