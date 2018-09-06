package com.guoping;


public class Light extends Device implements Switchable {
	
	public Light () {
		setDeviceName("Light"); 
	}
	
	@Override
	public void breakDevice() {
		System.out.print (getDeviceName() + ": broken glasses\n");
	}
	
	@Override
	public void turnOn () {
		System.out.print (getDeviceName() + ": light ON\n");
	}
	
	@Override 
	public void turnOff () {
		System.out.print (getDeviceName() + ": light OFF\n");
	}
}
