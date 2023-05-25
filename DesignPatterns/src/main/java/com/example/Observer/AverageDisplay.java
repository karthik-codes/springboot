package com.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class AverageDisplay implements CricketDataI {
	
	float overs;
	int wickets;
	int runs;
	
	


	public AverageDisplay( float overs, int wickets, int runs) {
		super();
		
		this.overs = overs;
		this.wickets = wickets;
		this.runs = runs;
	}

	



public AverageDisplay() {
		// TODO Auto-generated constructor stub
	}





public float getOvers() {
		return overs;
	}

public void setOvers(float overs) {
		this.overs = overs;
	}

public int getWickets() {
		return wickets;
	}

public void setWickets(int wickets) {
		this.wickets = wickets;
	}

public int getRuns() {
		return runs;
	}

public void setRuns(int runs) {
		this.runs = runs;
	}

//public void update(int runs, int wickets, float overs) {
//		this.averageScore=sDisplay.runRate*50;
//		
//	}


public List<CricketDataI> registerEvent(CricketDataI ci) {
	AverageDisplay avgDisplay=new AverageDisplay();
	List<CricketDataI> regClass=new ArrayList<CricketDataI>();
	regClass.add(avgDisplay);
	for(CricketDataI c:regClass) {
		c.update();
	}
	return regClass;
}

public  float update() {
	AverageDisplay obj=new AverageDisplay(10,2,40);
	float averageScore=obj.getRuns()*obj.getOvers();
	System.out.println("average score is"+averageScore);
	return averageScore;
}

public static void main(String[] args) {
	AverageDisplay obj1=new AverageDisplay();
	obj1.registerEvent(obj1);
}

}
