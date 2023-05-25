package oopsConcepts.Polymorphism;

public class OverridingParent {

	public  void StringManupulation(String str) {
		int length=str.length();
		String reverse="";
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
	}
	
	public static void main(String[] args) {
		

	}

}
