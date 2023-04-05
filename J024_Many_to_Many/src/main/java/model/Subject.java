
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
@Table(name = "subject1")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int subid;
	String subname;

	@ManyToMany
	@JoinTable(name = "std_sub1", joinColumns = @JoinColumn(name = "subid"), inverseJoinColumns = @JoinColumn(name = "stid"))

	List<Student> std;

	/**
	 * @return the subid
	 */
	public int getSubid() {
		return subid;
	}

	/**
	 * @param subid the subid to set
	 */
	public void setSubid(int subid) {
		this.subid = subid;
	}

	/**
	 * @return the subname
	 */
	public String getSubname() {
		return subname;
	}

	/**
	 * @param subname the subname to set
	 */
	public void setSubname(String subname) {
		this.subname = subname;
	}

	/**
	 * @return the std
	 */
	public List<Student> getStd() {
		return std;
	}

	/**
	 * @param std the std to set
	 */
	public void setStd(List<Student> std) {
		this.std = std;
	}

	public void addSubject(Student s) {
		if (std == null) {
			std = new ArrayList<Student>();
		}
		std.add(s);
	}
}
