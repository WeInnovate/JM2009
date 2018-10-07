package com.wellnwill.jm2009.learn.annotation.predefined.suppresswarning;

public class CarApp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Car car = new Car();
		
		car.start();

		car.move();

		car.stop();
	}

}
