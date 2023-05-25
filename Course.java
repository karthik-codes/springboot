package collegeModel.demo.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course {

	int courseId;
	String courseName;
	int cFees;
	List<Student> student;
	Department d;

	public Course(Department d) {
		super();
		this.d = d;
	}

	public Course(int courseId, String courseName, int cFees, List<Student> student) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.cFees = cFees;
		this.student = student;
	}

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Department getD() {
		return d;
	}

	public void setD(Department d) {
		this.d = d;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getcFees() {
		return cFees;
	}

	public void setcFees(int cFees) {
		this.cFees = cFees;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public HashMap<String, String> getstudentsDetailsFromCourse(String str1) {
		Student s = new Student();
		HashMap<String, String> hh = s.addStudentToCourse();
		hh.put("Adityaa", ".Net");
		for (Map.Entry ent : hh.entrySet()) {
			if (hh.containsValue(str1)) {
				System.out.println("students name who took the course: " + str1 + " is: " + ent.getKey());
			}
		}
		return hh;
	}
	
	public void getInfo(Student s) {
		System.out.println(s.getAddress().geteMailId());
	}

	public void removeStudentFromCourse(String studentName) {

		HashMap<String, String> hh = this.getstudentsDetailsFromCourse(studentName);
		if (hh.containsKey(studentName)) {
			System.out.println(
					"students : " + studentName + " successfully removed from the course : " + hh.get(studentName));

		}
	}

	public static void main(String[] args) {
		Address address1=Address.getInstance();
		Address address2=Address.getInstance();
//		address1("karnataka", "India", "ram.a@gmail.com", "santhosh.proff@gmail.com",
//				"Bangalore");
		
		address1.setState("karnataka");
		address1.setCountry("India");
		address1.seteMailId("ram@gmail.com");
		address1.setInstituteCityName("Bangalore");
		address1.setTeacherMailId("santhosh.proff@gmail.com");
		
		Address address21 = new Address("Tamilnadu", "India", "ganesh.b@gmail.com", "Aanand.proff@gmail.com",
				"Bangalore");
		Address address3 = new Address("kerala", "India", "shyam.c@gmail.com", "Mahesh.proff@gmail.com", "Bangalore");
		Address address4 = new Address("andra", "India", "sai.c@gmail.com", "aryan.proff@gmail.com", "Bangalore");

		Student s1 = new Student(101, "Ram", address1);
		Student s2 = new Student(102, "ganesh", address21);
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

		Course c = new Course();

		// c.getstudentsDetailsFromCourse(s1.addStudentToCourse(20,"java"), "java");

		c.getstudentsDetailsFromCourse("python");
		c.removeStudentFromCourse("Adityaa");
         c.getInfo(s1);
	}

}
