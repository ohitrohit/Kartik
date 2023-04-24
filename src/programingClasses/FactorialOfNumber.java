package programingClasses;

import java.util.Scanner;



public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		int Factorial = 1;
		for(int i = 1; i<=num; i++) {
			Factorial= Factorial*i;
			
		}
			System.out.println("factorial number is :"+Factorial);
	}
}
