package com.gft.java;

import java.util.ArrayList;
import java.util.HashMap;

class Animal {
}

class MachineG {
	@Override
	public String toString() {
		return "I am a Machine";
	}
	
	public void start() {
		System.out.println("Machine starting");
	}
}

class CameraG extends MachineG {
	@Override
	public String toString() {
		return "I am a Camera";
	}
	
	public void snap() {
		System.out.println("Snap!");
	}
}


public class Generics {
	
	public static void main(String[] args) {
		//Normal
		//explainGenerics();
		
		explainGenericsWildCards();
	}

	
	public void explainGenerics() {
		////////////Before Java 5 ////////////////
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		String fruit = (String)list.get(1);
		System.out.println(fruit);
		
		//////////// Modern style ////////////////
		
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("aligator");
		
		String animal = strings.get(1);
		
		System.out.println(animal);
		
		
		/////////// There can be more than one type argument //////
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		/////////// Java 7 style ///////////////
		ArrayList<Animal> someList = new ArrayList<Animal>();
	}

	public static void explainGenericsWildCards() {
		ArrayList<MachineG> list = new ArrayList<MachineG>();
		
		list.add(new MachineG());
		list.add(new MachineG());
		
		///////////
		
		ArrayList<CameraG> list2 = new ArrayList<CameraG>();
		
		list2.add(new CameraG());
		list2.add(new CameraG());

		//showList(list2);
		// Nos métodos nao fazem automáticamente o polimorfismo.
		// Así que é necesário, crear un método generico.
		
		showListGen2(list2);
	}

//	private static void showList(ArrayList<MachineG> list) {
//		for (MachineG value : list) {
//			System.out.println(value);
//		}
//	}
	
//	private static void showListGen(ArrayList<? > list) {
//		for (Object value : list) {
//			System.out.println(value);
//		}
//	}
	
	public static void showListGen(ArrayList<? extends MachineG> list) {
		for (MachineG value : list) {
			System.out.println(value);
			value.start();
		}
	}

	public static void showListGen2(ArrayList<? super CameraG> list) {
		for (Object value : list) {
			System.out.println(value);
		}
	}
}
