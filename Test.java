package basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;


public class Test {
	
	public static void findDuplicate(String str) {
		String str1=str.replaceAll(" ", "");
		 char[] ch=str1.toCharArray();
		 
		HashMap<Character,Integer> hh=new HashMap<>();
		for(char c:ch) {
			if(hh.containsKey(c)) {
				
				hh.put(c, hh.get(c)+1);
			}
			
			else {
				hh.put(c, 1);
			}
			}
		
		  for (Entry<Character, Integer> entry: hh.entrySet()) {

	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " : " + entry.getValue());
	            }
	        }
	}
	
	public static void removeDup(String s) {
		StringBuilder st=new StringBuilder();
		Set<Character> chars=new LinkedHashSet<>();
		char[] ch=s.toCharArray();
		for(char c:ch) {
			chars.add(c);
		}
		for(char chh:chars) {
			st.append(chh);
		}
		System.out.println(st);
	}
	
	
	
	public static void main(String[] args) {
		String s="java is greateee";
		findDuplicate(s);
        removeDup(s);
        
	}

}
