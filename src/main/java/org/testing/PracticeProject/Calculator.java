package org.testing.PracticeProject;

public class Calculator {
	

	public int add(int x, int y) {
		int z = x + y;
		return z;
	}

	public int sub(int x, int y) {
		int z = x - y;
		return z;
	}

	public int mul(int x, int y) {
		int z = x * y;
		return z;
	}

	public float div(int x, int y) {
		float z = x / y;
		return z;
	}

	public int mod(int x, int y) {
		int z = x % y;
		return z;
	}

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		int result_c1 = c1.add(10, 20);
		System.out.println(result_c1);
		int result_c2 = c1.sub(20, 10);
		System.out.println(result_c2);
		int result_c3 = c1.mul(20, 10);
		System.out.println(result_c3);
		float result_c4 = c1.div(20, 10);
		System.out.println(result_c4);
		int result_c5 = c1.mod(100, 10);
		System.out.println(result_c5);
	}
}
