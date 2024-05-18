package controlflowandloopassignments;

import java.util.Scanner;

public class GreaterNumber {
public static void main(String[] args) {
	System.out.println("Enter the number you want to check which is greater");
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();
	int num4 = sc.nextInt();
	
	//Condition to check which number is greater among the four numbers 
	
	if(num1>num2 && num1>num3 && num1>num4) {
		System.out.println(num1 + " is greater than " + num2 + " , " +  num3 + " , " +  num4);
	}else if(num2>num1 && num2>num3 && num2>num4) {
		System.out.println(num2 + " is greater than " + num1+ " , " + num3 + " , " +  num4);
	}else if(num3>num1 && num3>num2 && num3>num4) {
		System.out.println(num3 + " is greater than " + num1 + " , " +  num1 + " , " + num4);
	}else {
		System.out.println(num4 + " is greater than "+  num1 + " , " +   num2 + " , " + num3);
	}
}
}
