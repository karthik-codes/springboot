package collegeModel.demo.entities;

import java.util.ArrayList;
import java.util.List;

public class Address {
	String state;
	String country;
	String eMailId;
	String teacherMailId;
	String instituteCityName;
	
	
  public static Address address;
	public Address(String state, String country, String eMailId, String teacherMailId, String instituteCityName) {
		super();
		this.state = state;
		this.country = country;
		this.eMailId = eMailId;
        this.teacherMailId = teacherMailId;
		this.instituteCityName = instituteCityName;
	}
	
     public Address() {
		
	}
public static Address getInstance() {
	if(address==null)
		address=new Address();
	return address;
}

//	public static Address getInstance() {
//		if(address==null) {
//			address=new Address();
//		}
//		return address;		
//		}
	

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String geteMailId() {
		return eMailId;
	}

	public void seteMailId(String eMailId) {
		this.eMailId = eMailId;
	}

	public String getTeacherMailId() {
		return teacherMailId;
	}

	public void setTeacherMailId(String teacherMailId) {
		this.teacherMailId = teacherMailId;
	}

	public String getInstituteCityName() {
		return instituteCityName;
	}

	public void setInstituteCityName(String instituteCityName) {
		this.instituteCityName = instituteCityName;
	}

}
