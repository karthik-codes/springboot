package oopsConcepts.Abstraction;

public abstract class AbstractClassDemo {
	
//Abstraction is a process of hiding the implementation details and showing only functionality to the user.
	//and we will show only method name to user and hide its impl.
	//Abstract method means which does not have implementation provided in that menthod
	//we can't create object for abstract method but we can create reference variable to refer the mothods in .

	public AbstractClassDemo() {
		
			
		}
	public abstract  void demoMethod(); 
	//to access it create new class which extends it and give the method body for demoMethod().
	

}
