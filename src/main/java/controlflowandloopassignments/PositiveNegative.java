package controlflowandloopassignments;

import java.util.Scanner;

public class PositiveNegative {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number you want to check (Positive/Negative)");
	int number = sc.nextInt();
	if(number>0) {
		System.out.println(number + " is a positive number");
	}else if(number<0) {
		System.out.println(number + " is a negative number");
	}else {
		System.out.println("Number you entered is 0");
	}
}
}
