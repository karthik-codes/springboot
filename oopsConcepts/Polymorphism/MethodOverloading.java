package oopsConcepts.Polymorphism;

//compiletime -> methodoverloading
//runtime->methodoverriding
//functions with same name with different parameter is called overloading.(in same class)
//when parent and child has same methods implementing is called overriding(different clasess)



public class MethodOverloading {
	public void display() {
		for(int i=0;i<=10;i++) {
			System.out.print("\n");
			System.out.print("*");
		}
	}
	public void display(char ch) {
		for(int i=0;i<=10;i++) {
			System.out.print(ch);}
	}

	public static void main(String[] args) {
		MethodOverloading met = new MethodOverloading();
		met.display();
		met.display('$');

	}

}
