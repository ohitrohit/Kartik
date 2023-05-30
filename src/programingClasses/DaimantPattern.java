package programingClasses;

import java.util.Scanner;

public class DaimantPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		
		int spaces = n/2; //mid row
		int star =1;
		
		for(int i=1; i<=n; i++) { //Traverse across the row
			
			for(int j=1; j<=spaces; j++) { //print across the space 
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++) { //print across the star
				System.out.print("*");
			}
			System.out.println();
			
			if(i<=n/2) { //upper part
				spaces --;
				star=star + 2; //increase the star by 2
			}else { //lower part
				spaces ++;
				star = star - 2; //decrease the star by 2
			}
		}
	}
}
