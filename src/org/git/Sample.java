package org.git;

public class Sample {
	private void add() {
		int a = 10, b = 20;
		System.out.println(a + b);
	}

	private void sub() {
		int a = 20, b = 10;
		System.out.println(a - b);
	}

	public static void main(String[] args) {
		Sample a = new Sample();
		a.add();
		a.sub();
	}

}
