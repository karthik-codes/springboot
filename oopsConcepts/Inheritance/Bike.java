package oopsConcepts.Inheritance;

import java.util.HashMap;
import java.util.Map;

public class Bike {
	float Slary=897;
public Bike() {
		System.out.println("hi");
	}
	public static int bikePriceCalculated(String bikeName) {
		Map<String,Integer> giveRate=new HashMap<>();
			giveRate.put("apache", 50000);
			giveRate.put("pulsar", 34500);
			giveRate.put("bullet", 75000);
			if(giveRate.containsKey(bikeName)) {
				int rate=giveRate.get(bikeName);
			
			System.out.println(" Bike rate is:" +rate);
			}
			return 0;
		}
	
public static void main(String[] args) {
		bikePriceCalculated("pulsar");

	}

}
