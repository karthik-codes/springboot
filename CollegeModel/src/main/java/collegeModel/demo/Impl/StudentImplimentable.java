package collegeModel.demo.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import collegeModel.demo.entities.Institute;
import collegeModel.demo.entities.Student;

public interface StudentImplimentable {
	public void getstudentDetails(List<Student> student,int studentId);
	
	public HashMap<String, String> addStudentToCourse();
	
	public void addStudentToCollege(Institute i,Student s,String courseName);
	
	

}
