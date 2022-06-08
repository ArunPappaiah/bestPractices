package com.chainsys.bestPractices.decoupled;
// Objects of this class can work only with petrol engine and steel wheels.
// The class is decoupled from PetrolEngine class and SteelWheel class.
public class Car {
	private IEngine engine; // Early bound with petrol engine.
	public IWheel[] wheels; // Early bound with steel wheel
	// The type of engine, and the typr of wheel will be injected to the car class 
	// at run time using the constructors. This is called as constructor based 
	// dependency injection.
	public Car(IEngine engine,IWheel[] wheel) {
		this.engine = engine;
		this.wheels = wheel;
		
	}
	public void startCar() {
		engine.start();
		wheels[0].rotate();
		wheels[1].rotate();
		wheels[2].rotate();
		wheels[3].rotate();
	}
	public IWheel[] getWheels() {
		return this.wheels;
	}
}