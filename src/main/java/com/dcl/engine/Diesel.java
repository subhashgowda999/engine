package com.dcl.engine;

public class Diesel implements IEngine {

	@Override
	public boolean start() {
		System.out.println("diesel engine called");
		return true;
	}

}
