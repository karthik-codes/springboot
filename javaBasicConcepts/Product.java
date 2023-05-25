package javaBasicConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Product {
	int id;
	String name;
	Long price;
	public Product(int id, String name, Long price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getPrice() {
		return price;
	}


	public void setPrice(Long price) {
		this.price = price;
	}
public static void addElementsToProductViaArrayList() {
	List<Product> products=new ArrayList<>();
//	products.add(new Product(10,"Mac",1000L));
//	products.add(new Product(10,"android",1500L));
//	products.add(new Product(10,"ubuntu",2000L));
//	products.add(new Product(10,"windows",3000L));
//	products.add(new Product(10,"windiws11",4000L));
//	products.add(new Product(10,"explorer",5000L));
	for(int i=0;i<10;i++) {
		products.add(new Product(10,"Mac",1000L));
		
	}
	products.add(4, new Product(11,"Realme",1230L));
}

public static void solveHashMap() {
	Map<Integer,String> map=new HashMap<>();
	map.put(4, "karthik");
		map.put(5, "keerthan");
		map.put(6, "sai");
		map.put(9, "cr");
		for(Map.Entry<Integer,String>m:map.entrySet()) {
			System.out.println("map key:"+m.getKey()+":map value:"+m.getValue());
		}
		map.replace(6, "six");
		for(Map.Entry m:map.entrySet()) {
		
		}
	
	
}
public static void addElementsToProductViaLinkedlist() {
	LinkedList<Product> products=new LinkedList<>();
//	products.add(new Product(10,"Mac",1000L));
//	products.add(new Product(10,"android",1500L));
//	products.add(new Product(10,"ubuntu",2000L));
//	products.add(new Product(10,"windows",3000L));
//	products.add(new Product(10,"windiws11",4000L));
//	products.add(new Product(10,"explorer",5000L));
	for(int i=0;i<10;i++) {
		products.add(new Product(10,"Mac",1000L));
		
	}
	products.add(4, new Product(11,"Realme",1230L));
//	int i=products.size();
//	System.out.println(i);
}


	public static void main(String[] args) {
		Test1 t=new Test1();
		
		long start1 = System.nanoTime();
		addElementsToProductViaArrayList();
		//addElementsToProductViaLinkedlist();
		 long end1 = System.nanoTime(); 
		 System.out.println("Elapsed Time in nano seconds: "+ (end1-start1)); //254500
		 solveHashMap();
		
	}

}
