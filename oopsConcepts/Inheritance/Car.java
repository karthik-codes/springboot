package oopsConcepts.Inheritance;

public class Car extends Bike{
	
	public static int addTwoNumbers(int a,int b) {
		int c=a+b;
		return c;
	}
public Car() {
	System.out.println("hello");
}
	

	public static void main(String[] args) {
		Car c=new Car();
		Bike b=new Car();
		Bike.bikePriceCalculated("apache");
		Car.addTwoNumbers(10, 10);
		
		//Car cc= new Bike();
		//but here can't access child methods from parent object created.
		//only possible in interfacein the class we can create stright object 
	}

}
