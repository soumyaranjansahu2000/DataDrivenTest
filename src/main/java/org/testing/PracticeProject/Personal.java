package org.testing.PracticeProject;

import java.util.Scanner;

public class Personal {
	public void personalDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name");
		String first_Name =sc.next();
		System.out.println("Enter your last name");
		String last_Name = sc.next();
		System.out.println("Enter your Email ID");
		String email_id = sc.next();
		System.out.println("Enter your Gender(M/F)");
		String gender = sc.next();
		System.out.println("Enter your phone number");
		Long phone_number = sc.nextLong();
		System.out.println("Enter your postal code");
		Long postal_code = sc.nextLong();
		
		//Printing all the details at once 
		System.out.println("............................The Personal Details Entered..............................");
		System.out.println(first_Name);
		System.out.println(last_Name);
		System.out.println(email_id);
		System.out.println(gender);
		System.out.println(phone_number);
		System.out.println(postal_code);
	}
public static void main(String[] args) {
	Personal p1 = new Personal();
	p1.personalDetails();
}
}
