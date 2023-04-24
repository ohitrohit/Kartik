package programingClasses;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		  int num = sc.nextInt();
		  System.out.println("Reverse Order is:");
		  for(int i =num ; i>=0; i--) {
			  System.out.println(i);
		  }
	}
}
