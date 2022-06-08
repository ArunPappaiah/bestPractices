package com.chainsys.bestPractices.coupled;
// Objects of this class can work only with petrol engine and steel wheels.
// The class is tightly coupled with PetrolEngine class and SteelWheel class.
public class Car {
	private PetrolEngine engine; // Early bound with petrol engine.
	public SteelWheel[] wheels; // Early bound with steel wheel
	public Car() {
		engine = new PetrolEngine();
		wheels = new SteelWheel[4];
		wheels[0] = new SteelWheel();
		wheels[0].location = "Front Left";
		wheels[1] = new SteelWheel();
		wheels[1].location = "Front Right";
		wheels[2] = new SteelWheel();
		wheels[2].location = "Back Left";
		wheels[3] = new SteelWheel();
		wheels[3].location = "Back Right";
	}
	public Car(PetrolEngine engine,SteelWheel wheel) {
		this.engine = engine;
		this.wheels = wheels;
		wheels[0].location = "Front Left";
		wheels[1].location = "Front Right";
		wheels[2].location = "Back Left";
		wheels[3].location = "Back Right";
	}
	public void startCar() {
		engine.start();
		wheels[0].ratate();
		wheels[1].ratate();
		wheels[2].ratate();
		wheels[3].ratate();
	}
	public SteelWheel[] getWheels() {
		return this.wheels;
	}
}