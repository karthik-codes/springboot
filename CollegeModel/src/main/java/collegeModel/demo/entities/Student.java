package collegeModel.demo.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import collegeModel.demo.Impl.StudentImplimentable;

public class Student implements StudentImplimentable {
	private int studentId;
	private String sName;
	private Address address;
	private Department dept;
	private Course c;

//	public Student(Course c) {
//		super();
//		this.c = c;
//	}
//
//	public Course getC() {
//		return c;
//	}
//
//	public void setC(Course c) {
//		this.c = c;
//	}

//	public Student(Department dept) { // constructor overloading.
//		super();
//		this.dept = dept;
//	}

//	public Department getDept() {
//		return dept;
//	}
//
//	public void setDept(Department dept) {
//		this.dept = dept;
//	}

	public Student() {
	}

	public Student(int studentId, String sName, Address address) {
		super();
		this.studentId = studentId;
		this.sName = sName;
		this.address = address;

	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void getstudentDetails(List<Student> student, int studentId) {
		for (Student st : student) {
			if (st.studentId == studentId) {
				System.out.println("list is" + st.getAddress().geteMailId());
				System.out.println("name is" + st.getsName());
				System.out.println("Id is" + st.getStudentId());

			}
		}
	}

	public List<Student> addStudentsToList(List<Student> student) {
		return student;
	}

	public HashMap<String, String> addStudentToCourse() {
		Student s = new Student(105, "yogi", getAddress());
		Student stud = new Student(106, "adi", getAddress());
		Student stud1 = new Student(111, "kiran", getAddress());
		HashMap<String, String> map = new HashMap<>();
		map.put(s.getsName(), "python");
		map.put(stud.getsName(), "java");
		map.put(stud1.getsName(), "java");
		for (Map.Entry entry : map.entrySet()) {
			System.out.println("Successfully added student: " + entry.getKey() + " to course: " + entry.getValue());
		}
		return map;
	}

	public void addStudentToCollege(Institute i, Student s, String courseName) {
		Map<Student, Institute> siMap = new HashMap<>();
		if (i.getStudents().contains(s)) {
			System.out.println("student :" + s.getStudentId() + " is already present ");
		} else {
			siMap.put(s, i);
			System.out.println("student :" + s.getStudentId() + " is successfully added to college: " + i.getName());
			List<Student> st = i.getStudents();
			st.add(s);
			System.out.println("student added successfully " + s.getsName());
			st.forEach(x -> System.out.println("names are: " + x.getsName()));
			addStudentToCourse();
		}
	}

	public static void main(String[] args) {
		
        Address address1 = new Address("karnataka", "India", "ram.a@gmail.com", "santhosh.proff@gmail.com",
				"Bangalore");
		Address address2 = new Address("Tamilnadu", "India", "ganesh.b@gmail.com", "Aanand.proff@gmail.com",
				"Bangalore");
		Address address3 = new Address("kerala", "India", "shyam.c@gmail.com", "Mahesh.proff@gmail.com", "Bangalore");
		Address address4 = new Address("andra", "India", "sai.c@gmail.com", "aryan.proff@gmail.com", "Bangalore");

		List<Student> studentList1 = new ArrayList<>();
		studentList1.add(new Student(101, "Ram", address1));
		studentList1.add(new Student(102, "ganesh", address2));
		studentList1.add(new Student(103, "shyam", address3));
		studentList1.add(new Student(104, "sai", address4));

		List<Student> studentList2 = new ArrayList<>();
		studentList2.add(new Student(105, "sai", address4));
		studentList2.add(new Student(106, "keerthi", address3));

		// s1.getstudentDetails(studentList1);
		// ss.stream().map(x->x.getAddress()).collect(Collectors.toList()).forEach(x->System.out.println(x));
		// d.getAllStudentInDepts(studentList1);
		// System.out.println("output:"+s1.getStudentId()+s1.getsName());
		// System.out.println(address1.getState()+" "+address1.getCountry()+"
		// "+address1.geteMailId());

		Student sss = new Student();
//		s.addStudentToCourse(101, "java");
		// sss.addStudentToCourse();

//		s.addStudentsToList(studentList2);
//		s.getstudentDetails(studentList2,105);

		// create Institute object to add a student
		// create a new student object to add

		Student addNewStudent = new Student(111, "kiran", address4);

		Course course1 = new Course(10, "java", 13000, studentList2);
		Course course2 = new Course(20, "devops", 2600, studentList2);
		Course course3 = new Course(30, "c++", 4500, studentList1);
		Course course4 = new Course(40, "python", 6000, studentList1);

		List<Course> courseList1 = new ArrayList<>();
		courseList1.add(course1);
		courseList1.add(course2);
		courseList1.add(course3);

		List<String> dept1 = new ArrayList<>();
		dept1.add("CSE");
		dept1.add("MECH");
		dept1.add("ECE");

		List<String> dept2 = new ArrayList<>();
		dept2.add("CSE");
		dept2.add("MECH");
		dept2.add("ECE");

		Department d = new Department(1000, dept1, studentList1);
		Department d1 = new Department(1001, dept2, studentList2);

		List<Department> dList = new ArrayList();
		dList.add(d1);
		dList.add(d);

		Institute ins = new Institute("BMS", courseList1, studentList1, dList, address1);

		sss.addStudentToCollege(ins, addNewStudent, "java");

	}

}
