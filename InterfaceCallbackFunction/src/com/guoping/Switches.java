package com.guoping;

import java.util.ArrayList;

// it is manager class for switchable objects 
public class Switches {
	
	private ArrayList <Switchable> switchItems= new ArrayList<> ();
	
	public void registerCallback (Switchable item) {
		switchItems.add(item);
	}
	
	public void unregisterCallback (Switchable item) {
		switchItems.remove(item);
	}
	
	public void turnOnSwitch(){
		for (Switchable item: switchItems) {
			item.turnOn() ;
		}
	}
	
	public void turnOffSwitch (){
		for (Switchable item: switchItems) {
			item.turnOff();
		}
	}
}
