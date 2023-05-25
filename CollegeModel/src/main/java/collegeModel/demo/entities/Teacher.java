package collegeModel.demo.entities;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
	int tId;
	List<Course> course;
	Department d;
	String teacherName;

	public Teacher(int tId, List<Course> course, Department d, String teacherName) {
		super();
		this.tId = tId;
		this.course = course;
		this.d = d;
		this.teacherName = teacherName;

	}

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public Department getD() {
		return d;
	}

	public void setD(Department d) {
		this.d = d;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public void getTeacherInfo(Teacher t1) {
		Teacher t = new Teacher();
		for (String d : t1.getD().getdName()) {
			System.out.println("Teacher id is :" + t1.gettId() + " Mail id is: " + t1.getTeacherName()
					+ " belongs to department: " + d);
		}
	}

//}

	public static void main(String[] args) {
		Address address1 = new Address("karnataka", "India", "ram.a@gmail.com", "santhosh.proff@gmail.com",
				"Bangalore");
		Address address2 = new Address("Tamilnadu", "India", "ganesh.b@gmail.com", "Aanand.proff@gmail.com",
				"Bangalore");
		Address address3 = new Address("kerala", "India", "shyam.c@gmail.com", "Mahesh.proff@gmail.com", "Bangalore");
		Address address4 = new Address("andra", "India", "sai.c@gmail.com", "aryan.proff@gmail.com", "Bangalore");

		Student s1 = new Student(101, "Ram", address1);
		Student s2 = new Student(102, "ganesh", address2);
		Student s3 = new Student(103, "shyam", address3);
		Student s4 = new Student(104, "sai", address4);

		List<Student> studentList1 = new ArrayList<>();
		studentList1.add(s1);
		studentList1.add(s2);
		studentList1.add(s3);
		studentList1.add(s4);

		List<Student> studentList2 = new ArrayList<>();
		studentList1.add(s1);
		studentList1.add(s2);

		Course course1 = new Course(10, "java", 13000, studentList2);
		Course course2 = new Course(20, "devops", 2600, studentList2);
		Course course3 = new Course(30, "c++", 4500, studentList1);
		Course course4 = new Course(40, "python", 6000, studentList1);

		List<Course> courseList1 = new ArrayList<>();
		courseList1.add(course1);
		courseList1.add(course2);
		courseList1.add(course3);
		courseList1.add(course4);

		List<Course> courseList2 = new ArrayList<>();
		courseList2.add(course1);
		courseList2.add(course2);

		List<String> dNames = new ArrayList<>();
		dNames.add("CSE");
		dNames.add("MECH");
		dNames.add("ECE");

		// TeacherAddress tad=new TeacherAddress(150,"Anand@gmail.com","jammu");

		Department d1 = new Department(1000, dNames, studentList1);
		Teacher t1 = new Teacher(150, courseList1, d1, "santhosh");

		Teacher t2 = new Teacher(2, courseList2, d1, "Aanand");
		t1.getTeacherInfo(t1);

	}

}
