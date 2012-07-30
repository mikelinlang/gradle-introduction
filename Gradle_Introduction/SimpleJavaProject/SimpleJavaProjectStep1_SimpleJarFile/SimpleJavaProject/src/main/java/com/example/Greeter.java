package com.example;

public class Greeter {

	public String greet(String name) {
		return "Hello, " + name;
	}
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		String username= "User";
		if (args.length > 0) {
			username = args[0];
		}
		System.out.println(greeter.greet(username ));
	}
}
