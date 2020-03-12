package com.gft.java;

interface Executable {
	int execute(int a, int b);
}

interface StringExecutable {
	String execute(String a);
}

class Runner {
	public void run(Executable e) {
		System.out.println("Executing code block ...");
		int value = e.execute(12, 13);
		System.out.println("Return value: " + value);
	}
	
	public void run(StringExecutable e) {
		System.out.println("Executing code block ...");
		String value = e.execute("Hello");
		System.out.println("Return value: " + value);
	}
}



public class Lambdas {

	public static void main(String[] args) {
		
		int c = 100;
//		c = 8;
		int d = 77;
		
		Runner runner = new Runner();
		
		// Oldest java version
		runner.run(new Executable() {
			@Override
			public int execute(int a, int b) {
				System.out.println("Hello there.");
				int d = 8;
				return c + a + b;
			}
		});
		
		System.out.println("===================");
		
		runner.run((a, b) -> {
			System.out.println("Hello there");
			return c + a + b;
		});
		
		System.out.println("======================");
		
		Executable ex = (a,b) -> {
			System.out.println("Hello there.");
			// Can't do this; no new scope. int d = 99;
			return a + b + c;
		};
		
		runner.run(ex);
		
		
		Object codeblock = (Executable)(a,b) -> {
			System.out.println("Hello there.");
			// Can't do this; no new scope. int d = 99;
			return a + b + c;
		};

	}
}
