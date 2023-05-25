package com.example.Observer;

import java.awt.geom.Arc2D.Float;
import java.util.ArrayList;
import java.util.List;

public class CurrentScoreDisplay implements CricketDataI{
	
	
	Float currentScore;
	AverageDisplay avg;
	public CurrentScoreDisplay(Float currentScore, AverageDisplay avg) {
		super();
		this.currentScore = currentScore;
		this.avg = avg;
	}
	public CurrentScoreDisplay() {
		// TODO Auto-generated constructor stub
	}
	public Float getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(Float currentScore) {
		this.currentScore = currentScore;
	}
	public AverageDisplay getAvg() {
		return avg;
	}
	public void setAvg(AverageDisplay avg) {
		this.avg = avg;
	}
	public List<CricketDataI> registerEvent(CricketDataI obj) {
		CurrentScoreDisplay curScore=new CurrentScoreDisplay();
		List<CricketDataI> regClass=new ArrayList<CricketDataI>();
		regClass= avg.registerEvent(avg);
		regClass.add(curScore);
		for(CricketDataI c:regClass) {
			c.update();
		}
		return regClass;
	}
	public float update() {
		CurrentScoreDisplay cds=new CurrentScoreDisplay();
		System.out.println("current score is"+cds.avg.getRuns());
		return cds.avg.getRuns();
		
	}
	
	public static void main(String[] args) {
		CurrentScoreDisplay cd=new CurrentScoreDisplay();
		cd.update();
	}

	
}
