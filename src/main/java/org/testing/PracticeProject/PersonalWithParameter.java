package org.testing.PracticeProject;

import java.util.Scanner;

public class PersonalWithParameter {
	String first_Name;
	String last_Name;
	String email_id;
	String gender;
	Long phone_number;
	Long postal_code;

	PersonalWithParameter(String first_Name, String last_Name, String email_id, String gender, Long phone_number,
			Long postal_code) {
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.email_id = email_id;
		this.gender = gender;
		this.phone_number = phone_number;
		this.postal_code = postal_code;
	}
		PersonalWithParameter(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name");
		first_Name = sc.next();
		System.out.println("Enter your last name");
		last_Name = sc.next();
		System.out.println("Enter your Email ID");
		email_id = sc.next();
		System.out.println("Enter your Gender(M/F)");
		gender = sc.next();
		System.out.println("Enter your phone number");
		phone_number = sc.nextLong();
		System.out.println("Enter your postal code");
		postal_code = sc.nextLong();
	}

	public void show() {

		// Printing all the details at once
		System.out.println("............................The Personal Details Entered..............................");
		System.out.println(first_Name);
		System.out.println(last_Name);
		System.out.println(email_id);
		System.out.println(gender);
		System.out.println(phone_number);
		System.out.println(postal_code);
	}

	public static void main(String[] args) {
		PersonalWithParameter p1 = new PersonalWithParameter();
		p1.show();

	}

}
