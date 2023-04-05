package Collection;

public class C008_Student implements Comparable<C008_Student> {
	int id;
	String name;
	String email;

	public C008_Student(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "C0008_Student [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	public void display() {
		System.out.println(id + " " + name + " " + email);
	}

	@Override
	public int compareTo(C008_Student o) {
		int i1 = o.id; // 10 20
		int i2 = this.id; // 20 4
		int k = 0;
		if (i2 > i1) {
			k = -1; // nagative
		} else if (i2 < i1) {
			k = 1; // positive
		} else {
			k = 0;
		}
		return k;
	}

}
