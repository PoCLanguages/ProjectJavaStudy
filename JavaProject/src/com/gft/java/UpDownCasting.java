package com.gft.java;

class Machine {
	public void start() {
		System.out.println("Machine stated.");
	}
}

class Camera extends Machine {
	@Override
	public void start() {
		System.out.println("Camera started");
	}
	
	public void snap() {
		System.out.println("Photo taken.");
	}
}

public class UpDownCasting {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();

		machine1.start();
		camera1.start();
		camera1.snap();
		// Podemos perceber que hasta este momento
		// todo funciona bien
		
		
		//Updcasting
		Machine machine2 = camera1;
		machine2.start();
		// error: machine.snap();
		
		//Downcasting
		Machine machine3 = new Camera();
		Camera camera2 = (Camera)machine3;
		camera2.start();
		camera2.snap();
		
		//Doesn't work --- runtime error.
		Machine machine4 = new Machine();
		// Camera camera3 = (Camera)machine4;
		// camera3.start();
		// camera3.snap();
		
	}
	
	
}
