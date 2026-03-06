package com.demo;

public class Example {

	public void hello() {
		System.out.println("Hello World");
		loop();
		welcome();
	}

	private void welcome() {
		System.out.println("welcome method");
	}

	protected void greet() {
		System.out.println("greet method");
		loop();
	}

	void spring() {
		System.out.println("spring method");
		loop();
	}

	private void loop() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
