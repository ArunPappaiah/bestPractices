package com.chainsys.bestPractices.defaultmethod;

public interface IVehicle {
	void start();
	default void move() {
		System.out.println("Vehicle is moving");
	}
	
}
class Car implements IVehicle{
	@Override
	public void start() {
		System.out.println("Car is starting");
	}
}
class Bike implements IVehicle{
	@Override
	public void start() {
		System.out.println("Bike is starting");
	}
}