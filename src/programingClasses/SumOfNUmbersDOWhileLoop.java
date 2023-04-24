package programingClasses;

import java.util.Scanner;

public class SumOfNUmbersDOWhileLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the min value of a range:");
		int min = sc.nextInt();
		
		System.out.println("Enter the Max value of the range:");
		int max = sc.nextInt();
		
		int sum=0;
		do {
			sum=sum+min;
			min++;
			//System.out.println(sum);
		}while(min<=max);
		
		System.out.println(sum);
	}
}
