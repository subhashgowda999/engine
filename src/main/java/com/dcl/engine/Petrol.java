package com.dcl.engine;

public class Petrol implements IEngine {

	@Override
	public boolean start() {
		System.out.println("petrol engine called");
		return true;
	}

}
