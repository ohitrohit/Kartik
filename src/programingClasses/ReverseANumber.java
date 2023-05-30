package programingClasses;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		System.out.println("*****************");
		while(num!=0) {
			System.out.println(num%10);
			num=num/10;
		}
	}
}
