package programingClasses;

import java.util.Scanner;

public class HollowCrossPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value:");
		int value = sc.nextInt();
		for(int i =1; i<=value; i++) {
			for(int j=1; j<=value; j++) {
				if(i==1 || j==1 || i==value || j==value || i==j || i+j==value+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
}
