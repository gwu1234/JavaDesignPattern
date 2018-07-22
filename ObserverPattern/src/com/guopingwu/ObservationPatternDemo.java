package com.guopingwu;

public class ObservationPatternDemo {

	public static void main(String[] args) {
		Subject subject = new Subject();

	      new HexaObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);

	      System.out.println("First state change: 30");	
	      subject.setState(30);
	      System.out.println("Second state change: 20");	
	      subject.setState(20);
	      System.out.println("First state change: 10");	
	      subject.setState(10);
	      System.out.println("Second state change: 9");	
	      subject.setState(9);
	      System.out.println("First state change: 8");	
	      subject.setState(8);
	      System.out.println("Second state change: 7");	
	      subject.setState(7);
	      System.out.println("First state change: 6");	
	      subject.setState(6);
	      System.out.println("Second state change: 5");	
	      subject.setState(5);
	}

}
