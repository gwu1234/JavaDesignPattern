package com.guoping;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creates switchable objects 
		Fan fan = new Fan() ;
		Light light = new Light();	
		
		// create a manager class for switchable objects 
		Switches switches = new Switches();
		
		// register switchable objects to the manager 
		switches.registerCallback(fan);
		switches.registerCallback(light);
        
		// turn on and off all objects 
	    switches.turnOnSwitch();
	    switches.turnOffSwitch();
	    
	    // unregister 
	    switches.unregisterCallback(fan);
		switches.unregisterCallback(light);
	}

}
