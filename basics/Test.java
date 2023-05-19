package basics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.List;
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
	
	public static void addNumbers(int[] numArray) {
		List<Integer>listNum=new ArrayList<Integer>();
		listNum=Arrays.stream(numArray).boxed().toList();
		int l=listNum.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println(l);
		}
	public static void terminalOperations(List<Integer> ll) {
	   int even=ll.stream().reduce(0,(j,i)->i+i);
	   System.out.println("sum is"+even);
	   int s=ll.stream().sorted().collect(Collectors.summingInt(Integer::intValue));
	   System.out.println(s);
	}
	
	public static void main(String[] args) {
		String s="java is greateee";
		//findDuplicate(s);
        //removeDup(s);
        int[] num= {1,2,3,4};
       // addNumbers(num);
        List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        terminalOperations(l);
	}

}
