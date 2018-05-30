package com.guopingwu;

public class MediatorPatternDem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User robert = new User("Robert");
	    User john = new User("John");

	    robert.sendMessage("Hi! John!");
	    john.sendMessage("Hello! Robert!");
	}

}
