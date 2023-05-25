package basics;

import java.util.HashMap;

public  class RepeatedEleCount {
	//count the no. of occurencess of a word in a sentence
	
	public static void  countOccurences(String str) {
		String stringWithoutSpace=str.replaceAll(" ","");
		System.out.println(stringWithoutSpace);
		int length=stringWithoutSpace.length(),i=0,j=0,count=0;
		char[] c=stringWithoutSpace.toCharArray();
		for(i=0;i<c.length;i++) {
			for(j=i+1;j<c.length;j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count ++;
					//c=str.charAt(i);
					
				}
			}
		}
		System.out.println("repeated charecter is: "+c+" :with count: "+count);
	}
	
	public static void countOccurences2(String str) {
		 
		//HashMap char as a key and occurrence as a value  
		HashMap <Character, Integer> charCount = new HashMap<>();  
		for (int i = str.length() - 1; i >= 0; i--)   
		{  
		if(charCount.containsKey(str.charAt(i)))   
		{  
		int count = str.charAt(i);  
		charCount.put(str.charAt(i), ++count);  
		}   
		else   
		{  
		charCount.put(str.charAt(i),1);  
		}  
		}  
		System.out.println(charCount);
		}  
		
	
	public static void countCharecterInString(String str, char ch) {
		long count=str.chars().filter(c->c==ch).count();
		System.out.println("count of charecter: "+ch+" is: "+count);
		
	}
	

	public static void main(String[] args) {
		
    countOccurences2("I am learning core Java");
    //countCharecterInString("learning javaa",'a');
	}

}
