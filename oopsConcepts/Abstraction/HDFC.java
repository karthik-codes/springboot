package oopsConcepts.Abstraction;

import java.util.HashMap;
import java.util.Map;

public class HDFC implements RBIManager,CentralInt{

	@Override
	public void oderByGovernament() {
		System.out.println("order from CentralInt");
		
	}

	@Override
	public int rateOfInterest(String bankName) {
		Map<String,Integer> map=  new HashMap<>();
		map.put("HDFC",12);
		map.put("BOB",20);
		map.put("Union",11);
		
		int ROI=map.get(bankName);
		System.out.println(ROI);
		return 0;
	}
	public static void main(String[] args) {
		RBIManager rbi = new HDFC();
		rbi.rateOfInterest("BOB");
		
		CentralInt cit=new HDFC();
		cit.oderByGovernament();
		
		cit.getFactorial(5);
		
		CentralInt.getPalindrome("radar");
		
		
}}
