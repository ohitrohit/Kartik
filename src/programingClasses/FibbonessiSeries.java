package programingClasses;

import java.util.Scanner;

public class FibbonessiSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range for fibbonecci series");
		int range = sc.nextInt();
		
		int a =0;
		int b =1;
		
		System.out.print(" "+a);
		System.out.print(" "+b);
		
		for(int i =1;i<=range;i++) {
			int c =a+b;
			if(c<=range) {
				System.out.print(" "+c);
				a=b;
				b=c;
				
			}
		}
	}
}
