package collegeModel.demo.entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	int dId;
	List<String> dName;
	List<Student> s;

	public Department(int dId, List<String> dName, List<Student> s) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.s = s;

	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public List<String> getdName() {
		return dName;
	}

	public void setdName(List<String> dName) {
		this.dName = dName;
	}

	public List<Student> getS() {
		return s;
	}

	public void setS(List<Student> s) {
		this.s = s;
	}

	public int getAllStudentInDepts(Department d) {
		List<String> st = new ArrayList<>();
		int count = 0;
		for (String d1 : d.getdName()) {

			for (Student stu : d.getS()) {
				count++;
			}

			System.out.println("the number of students in department: " + d1 + " is: " + count);
			continue;
		}
		return 0;
	}

	public void getTeachersByDepartment(Teacher t1) {
		// t1.stream().map(x->x.get) {
		for (String s1 : t1.getD().dName) {
			System.out.println("teacher name: " + t1.getTeacherName() + "belongs to department: " + s1);
			// }
		}

	}

	public void getCountOfTeachersInDept(Department d) {

	}

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
		studentList2.add(s1);
		studentList2.add(s2);

		Course course1 = new Course(10, "java", 13000, studentList2);
		Course course2 = new Course(20, "devops", 2600, studentList2);
		Course course3 = new Course(30, "c++", 4500, studentList1);
		Course course4 = new Course(40, "python", 6000, studentList1);

		List<Course> courseList1 = new ArrayList<>();
		courseList1.add(course1);
		courseList1.add(course2);
		courseList1.add(course3);

		List<String> dNames = new ArrayList<>();
		dNames.add("CSE");
		dNames.add("MECH");

		List<String> dNames1 = new ArrayList<>();
		dNames.add("CIVIL");
		dNames.add("ECE");

		Department dept = new Department(1000, dNames, studentList1);
		Department d1 = new Department(1001, dNames1, studentList2);

		Teacher t = new Teacher(151, courseList1, dept, "Santhosh");

		Department dList = new Department(1000, dNames1, studentList2);

		dept.getAllStudentInDepts(dept);

		dept.getTeachersByDepartment(t);
	}
}
