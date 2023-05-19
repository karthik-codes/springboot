package oopsConcepts.Abstraction;

public interface CentralInt {
public void oderByGovernament();
default int getFactorial(int no) {
	int result=1;
	for(int i=1;i<=no;i++) {
		result=result*i;
	}
	System.out.println(result);
	return 0;
}

static void  getPalindrome(String str) {
	String reverse="";

	for(int i=str.length()-1;i>=0;i--) {
		reverse=reverse+str.charAt(i);}
	if(str.equals(reverse)) {
		
		
		System.out.println("Entered string/number is a palindrome."); } 
	      else  {
	         System.out.println("Entered string/number isn't a palindrome.");}   
		
	}
	

}


