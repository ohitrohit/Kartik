package programingClasses;

import java.util.Scanner;

public class BoxPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) { //traversing through the row
			for(int j=1; j<=n; j++) { //traversing throgh the column
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
