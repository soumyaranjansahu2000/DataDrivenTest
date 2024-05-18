package controlflowandloopassignments;

import java.util.Scanner;

public class PrimeNumberProblem {
	public static void main(String[] args) {
		System.out.println("Enter the number you want to check wheather it is prime or not");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp=0;
		
		//Logic to check the number is prime or not 
		
		for(int i =2;i<=number-1;i++) {
			if(number%i==0) {
				temp = temp+1;
			}
		}
		if(temp>0) {
			System.out.println("The number is not prime");
		}else {
			System.out.println("The number is prime");
		}
	}
}
