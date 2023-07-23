package org.edureka.com;


public class HelloWorld {
	private void nonStaticTest() {
		System.out.println("Non static method");
	}
	static void staticTest() {
		System.out.println("static method");
	}
	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		System.out.println("Hello World Madhu Pavan");
		helloWorld.nonStaticTest();
		staticTest();
	}

}
