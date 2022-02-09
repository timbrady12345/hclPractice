package com.hcl.excercises.java8examples;

interface Instrument {
	default void print() {
		System.out.println("Music");
	}
	
	static void makeNoise() {
		System.out.println("AGHHHH");
	}
}

interface Piano {
	default void print() {
		System.out.println("Boop boop beep");
	}
}

class Sound implements Instrument, Piano{
	public void print() {
		Instrument.super.print();
		Piano.super.print();
		Instrument.makeNoise();
	}
}

public class StaticMethodEx {
	public static void main(String[] args) {
		Instrument strummy = new Sound();
		strummy.print();
	}
}