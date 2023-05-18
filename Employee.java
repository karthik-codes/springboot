package basics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	int age;
	String name;
	int Salary;

	public Employee(int age, String name, int salary) {
		super();
		this.age = age;
		this.name = name;
		Salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public static void main(String[] args) {

		Employee e1 = new Employee(30, "krishna", 50000);
		Employee e2 = new Employee(50, "Ram", 70000);
		Employee e3 = new Employee(38, "abhay", 30000);
		Employee e4 = new Employee(45, "kishan", 40000);
		Employee e5 = new Employee(25, "varun", 5500);

		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);

		// Sort By age

//    List<Employee> sortedListByAge=empList.stream().sorted((o1,o2)->o1.getAge() - o2.getAge()).collect(Collectors.toList());
//    sortedListByAge.forEach(x->System.out.println(x.age+" : "+x.name+" : "+x.Salary));
//    
//    List<Employee> sortedListByAge2=empList.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
//    sortedListByAge2.forEach(x->System.out.println(x.age+" : "+x.name+" : "+x.Salary));
//    
//    //sort by Salary
//	
//	 empList.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
//	 empList.forEach(x->System.out.println(x.age+" : "+x.name+" : "+x.Salary));

		// sort by Name
//	 
//    empList.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));
//    empList.forEach(x->System.out.println(x.name+" : "+x.Salary));
//    
		List<Employee> sortedListByName = empList.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		sortedListByName.forEach(x -> System.out.println(x.age + " : " + x.name + " : " + x.Salary));
	}
}
