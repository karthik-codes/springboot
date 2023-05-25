package collegeModel.demo.entities;

import java.util.ArrayList;
import java.util.List;

import collegeModel.demo.Impl.InstituteImplimentable;

public class Institute implements InstituteImplimentable {
	String name;
	List<Course> course;
	List<Student> students;
	List<Department> dept;
	Address add;

	public Institute(String name, List<Course> course, List<Student> students, List<Department> dept, Address add) {
		super();
		this.name = name;
		this.course = course;
		this.students = students;
		this.dept = dept;
		this.add = add;
	}

	public Institute(String name2) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Department> getDept() {
		return dept;
	}

	public void setDept(List<Department> dept) {
		this.dept = dept;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public void getDetailsOfInstitute(List<Course> cc, List<Department> dd, List<Student> ss, Address a) {
		Institute i = new Institute(name);
		for (Course cs : cc) {
			System.out.println("college Name: " + i.getName() + " in city: " + a.getInstituteCityName()
					+ " :courses available are: " + cs.getCourseName());

		}
		for (Department dept : dd) {
			System.out.println("departments available in: " + i.getName() + " :are: " + dept.getdName());
		}
		int count = 0;
		for (Student stude : ss) {
			System.out.println("students names in college : " + i.getName() + " :are: " + stude.getsName());
			count++;
		}
		System.out.println("total no. of students in institute are: " + count);

	}

	public static void main(String[] args) {
		Student s = new Student();
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

		Department d = new Department(1000, dNames, studentList1);
		Department d1 = new Department(1000, dNames, studentList2);

		List<Department> dList = new ArrayList();
		dList.add(d1);
		dList.add(d);

		Institute institute1 = new Institute("RV", courseList1, studentList1, dList, address1);

		// institute2.getAllcoursesAvailable(courseList2);
		institute1.getDetailsOfInstitute(courseList1, dList, studentList1, address1);
	}

}
