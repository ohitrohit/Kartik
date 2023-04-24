package programingClasses;

import java.util.Scanner;

public class ReverseRightTringale {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		int num = sc.nextInt();
		for(int i =1;i<=num; i++) {
			for(int j=num;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
