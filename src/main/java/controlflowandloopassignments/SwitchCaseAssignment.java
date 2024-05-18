package controlflowandloopassignments;

import java.util.Scanner;

public class SwitchCaseAssignment {
public static void main(String[] args) {
	System.out.println("Enter the performance id of the employee(between 1 to 5)");
	Scanner sc = new Scanner(System.in);
	int performance_id = sc.nextInt();
	
	//Switch case condition to determine the values using the performance id 
	
	switch(performance_id){
		case 1:
			System.out.println("Poor Performance");
			break;
		case 2:
			System.out.println("Need to Improve");
			break;
		case 3:
			System.out.println("Good performance");
			break;
		case 4:
			System.out.println("Excellent performance");
			break;
		case 5:
			System.out.println("Employee of the year");
			break;
		default:
			System.out.println("Enter the number only between 1 to 5");
	}
	
	
}
}
