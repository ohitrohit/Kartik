package javaconceptpractice;

import java.util.Scanner;

public class ScannerClassPractice {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter your name");
		String Name=s1.nextLine();
		System.out.println("enter your age");
		int Age = s1.nextInt();
		System.out.println("enter your city");
		String City = s1.next();
		System.out.println("enter your mobile number");
		long Mob = s1.nextLong();
		
		System.out.println("Hello "+Name);
		System.out.println("Age="+Age);
		System.out.println("city="+City);
		System.out.println("Mobile Number="+Mob);
		System.out.println("ALL THE DEATILS ARE CAPTURE");
	}
}
