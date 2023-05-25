package javaBasicConcepts;

import java.util.HashSet;
import java.util.Set;

public class StringExamples {

	public StringExamples() {
	
	}
	//String literal
	String s="back end";
	//by object creation
	String str = new String("front-end");
	//string pool is located in heap memory and  objects all stored in there.
	
	/*stack memory
	 * is used to store the order of method execution and local variables
	 * allocated to each thread at run time.
	 * stack follows LIFO
	 * If there is no space for creating the new objects, it throws the java.lang.StackOverFlowError
	 * JVM created seperate stack for each Thread in java
	  */
	
	/* Heap memory
	 * It is created when the JVM starts up and used by the application as long as the application runs. 
	 * It stores objects and JRE classes.
	 * Whenever we create objects it occupies space in the heap memory 
	 * while the reference of that object creates in the stack
	 *We will not handle memory manually Gc will take care.
	 *If the heap space is full, it throws the java.lang.OutOfMemoryError
	 * */
	
	//StringBuilder are modifiable string objects and it is very widely used.
	
	 class ArrayExamples extends StringExamples {
		 void weep() {
			 System.out.println("success");
		 }
	 }
	
	
	public static void replaceString(String str) {
		str=str.replaceAll(" ","");
		System.out.println(str);
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(str.charAt(i));
		}
	}
	
	public static void findChar(String s1) {
		int count =0;
		char c=' ';
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<s1.length();j++) {
				if(s1.charAt(i)==s1.charAt(j)) {
					count ++;
					c=s1.charAt(j);
					break;
				}
		}
		}
		System.out.println("repeates charecter is:"+c+":with count:"+count);
	}
	public static void deleteDuplicateChar(String s2) {
		char [] ex=s2.toCharArray();
		Set<Character> chh=new HashSet<>();
		for(Character ch:ex) {
			chh.add(ch);
		}
		chh.stream().forEach(x->System.out.println(x));
	}

	public static void main(String[] args) {
		
String str="String pool is a part in heap memory";
String s1="javavv";
String s2="karthik";
replaceString(str);
findChar(s1);
deleteDuplicateChar(s2);



	}

}
