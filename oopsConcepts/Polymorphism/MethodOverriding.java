package oopsConcepts.Polymorphism;

public class MethodOverriding extends OverridingParent{
	public  void StringManupulation(String str) {
		String s=str.replaceAll(" ", "");			
		System.out.println(s);
	}
	
public static void main(String[] args) {
		MethodOverriding m = new MethodOverriding();
		m.StringManupulation("oo easyjhf bbek m");
		OverridingParent o =new OverridingParent();
		o.StringManupulation("karthik");
	}

}
