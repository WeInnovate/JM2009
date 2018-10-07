package com.wellnwill.jm2009.learn.annotation.predefined.suppresswarning;

public class Car {

	@Deprecated
	public void start() {
		System.out.println("Car has been started using key.");
	}
	
	public void startWithoutKey() {
		System.out.println("Car has been started without key.");
	}

	public void move() {
		System.out.println("Car is moving..");
	}

	public void stop() {
		System.out.println("Car has been stopped.");
	}

}
