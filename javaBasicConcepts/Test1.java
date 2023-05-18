package javaBasicConcepts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
	public void sayHello() {
		System.out.println("djh");
	}

	public static void main(String[] args) {
		
//List<String> alist=new ArrayList<>();
//alist.add("AC");
//alist.add("fv");
//alist.add("sf");
//alist.add("vv");
//alist.forEach(y->System.out.println(y));
//System.out.println(alist.indexOf(0));
	Map<Integer,String> map =new HashMap<>();		
		map.put(5,"ajay");
		map.put(34,"karthik");
		map.put(17,"varadh");
		map.put(8,"shwetha");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(x->
		System.out.println(x));
	}

}
