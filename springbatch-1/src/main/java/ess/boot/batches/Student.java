package ess.boot.batches;


public class Student {
	

	int studentid;
	String studentname;
	String studentstream;
	
	public Student() {
		
	}
	
	public Student(int id, String name, String stream) {
		this.studentid = id;
		this.studentname = name;
		this.studentstream = stream;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentstream() {
		return studentstream;
	}

	public void setStudentstream(String studentstream) {
		this.studentstream = studentstream;
	}
	
	

}
