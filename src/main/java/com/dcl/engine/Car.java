package com.dcl.engine;

public class Car {
	public IEngine engine;
	public Car() {
		System.out.println("zero parameter con");
	}
//	public Car(IEngine engine) {
//		this.engine=engine;
//	}
	public void setEngine(IEngine engine) {
		this.engine=engine;
		System.out.println("setter called");
	}
	public void move() {
		boolean status=engine.start();
		if(status) {
			System.out.println("car is started");
		}else {
			System.out.println("engine problem");
		}
	}

}
