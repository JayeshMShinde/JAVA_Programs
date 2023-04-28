package sawgger.springbootswagger;

public class Student {

	private int rno;
	private String  name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rno, String name) {
		super();
		this.rno = rno;
		this.name = name;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
