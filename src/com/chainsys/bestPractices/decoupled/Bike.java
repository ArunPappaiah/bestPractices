package com.chainsys.bestPractices.decoupled;
//Object of this class can work only petrol engine and steel
//The car class is tightcoupled with petrol engine class and steel class
public class Bike {
 private IEngine engine; // Early bound with petrol engine

 public IEngine getEngine() {
     return engine;
 }
 // The type of engine, and the type of Engine will be injected to the Bike class
 // At runtime using the setter method. This is called as setter based
 // dependency injection

 public void setEngine(IEngine engine) {
     this.engine = engine;
 }
 // The type of engine, and the type of wheel will be injected to the Bike class
     // At runtime using the setter method. This is called as setter based
     // dependency injection
 public void setWheels(IWheel[] wheels) {
     this.wheels = wheels;
 }

 private IWheel[] wheels; // Early bound with wheel interface

 public Bike(IEngine engine, IWheel[] wheel) {
     this.engine = engine;
     this.wheels = wheel;
 }
 public Bike() {
     
 }

 public void startBike() {
     engine.start();
     wheels[0].rotate();
     wheels[1].rotate();
 }

 public IWheel[] getWheels() {
     return this.wheels;
 }
}