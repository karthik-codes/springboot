package CouplingExamples;

public class Topic1 implements Topic {

	public static void main(String[] args) {
		Topic t1=new Topic1();
		t1.understand();

	}

	@Override
	public void understand() {
		System.out.println("dh");
		
	}
//here we can implement any method or class by calling it separately.
	//so we can maintain seperate classes and it will be easy to maintain.
}
