package org.fibonacci.core;

public class App {
	public static void main(String[] args) {
		Fibonacci f = Fibonacci.get();
		System.out.println("F(-1) = " + f.run(-1));
		System.out.println("F(0) = " + f.run(0));
		System.out.println("F(1) = " + f.run(1));
		System.out.println("F(2) = " + f.run(2));
		System.out.println("F(6) = " + f.run(6));
		
		f = Fibonacci.get();
		System.out.println("F(4) = " + f.run(4));
		System.out.println("F(73) = " + f.run(73));
		System.out.println("F(92) = " + f.run(92));
	}
}
