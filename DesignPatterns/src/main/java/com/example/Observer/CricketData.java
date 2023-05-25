//package com.example.Observer;
//
//
////used when one-many relationship is established. the host should know when the state changes.
//public class CricketData {
//	float overs;
//	int wickets;
//	int runs;
//	
//	//CurrentScoreDisplay csDisplay;
//	//AverageDisplay avgDisplay;
//	ArrayList <CricketScoreInterface>displaylist
//	public CricketData(float overs, int wickets, int runs) {
//		super();
//		this.overs = overs;
//		this.wickets = wickets;
//		this.runs = runs;
//	}
//	// update registerdievices
//	public int getLatestRuns() {
//		return 100;
//	}
//	public float getLatestOver() {
//		return (float)10.3;
//	}
//	public int getLatestWicket() {
//		return 3;
//	}
//	public void dataChanged() {
//		runs=getLatestRuns();
//		wickets=getLatestWicket();
//		overs=getLatestOver();
//		
//		/*
//		 * csDisplay.update(runs,wickets,overs); avgDisplay.update(runs,wickets,overs);
//		 * iosDisplay tablet.disp
//		 */
//		
//		for loop(CricketScoreInterface dips: displaylist)
//		
//		disp.update
//	}
//}
