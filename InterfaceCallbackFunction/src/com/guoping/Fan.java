package com.guoping;

public class Fan extends Device implements Switchable {
	
	public Fan() {
		setDeviceName("Fan"); 
	}

	@Override
	public void breakDevice() {
		System.out.print (getDeviceName() + ": broken fan\n");
	}
	
	@Override
	public void turnOn () {
		System.out.print (getDeviceName() + ": fan ON\n");
	}
	
	@Override 
	public void turnOff () {
		System.out.print (getDeviceName() + ": fan OFF\n");
	}
}
