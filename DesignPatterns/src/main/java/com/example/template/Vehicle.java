package com.example.template;
//create a abstract method for method reusability.


public abstract class Vehicle {
abstract void start();
abstract void stop();

public  final void Action() {
	start();
	stop();
}
}
