package com.dcl.engine;

public class Cng implements IEngine {

	@Override
	public boolean start() {
		System.out.println("cng engine called");
		return true;
	}
}
