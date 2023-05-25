package com.example.Singleton;

import java.util.HashMap;
import java.util.Map;

  class Singleton {
	String name;
	int age;
	int salary;
	
	private static Singleton instance;
	
	private Singleton() {
		name="karthik";
		age=24;
		salary=30000;
	}
	//lazy initialization using double check and locking.
	 private static Singleton getInstance() {
		if(instance == null){
			synchronized(Singleton.class) {
				if(instance == null) {
					instance=new Singleton();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		Singleton s=Singleton.getInstance();
		String name=s.name;
		
		Singleton s1=Singleton.getInstance();
		int kAge=s1.age;
		System.out.println(name);
		System.out.println(kAge);
	
	}
	}
