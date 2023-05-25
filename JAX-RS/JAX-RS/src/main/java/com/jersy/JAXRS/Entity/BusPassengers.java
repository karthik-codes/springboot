package com.jersy.JAXRS.Entity;

public class BusPassengers {
	
	private int pId;
	private String passengerName;
	private int pPrice;
	private String passengerDestination;
	
	public BusPassengers() {}

	public BusPassengers(int pId, String passengerName, int pPrice, String passengerDestination) {
		super();
		this.pId = pId;
		this.passengerName = passengerName;
		this.pPrice = pPrice;
		this.passengerDestination = passengerDestination;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	public String getPassengerDestination() {
		return passengerDestination;
	}

	public void setPassengerDestination(String passengerDestination) {
		this.passengerDestination = passengerDestination;
	}

	@Override
	public String toString() {
		return "Bus [pId=" + pId + ", passengerName=" + passengerName + ", pPrice=" + pPrice + ", passengerDestination="
				+ passengerDestination + "]";
	};
	
	
}
