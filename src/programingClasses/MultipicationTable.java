package programingClasses;

import java.util.Scanner;

public class MultipicationTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		System.out.println(num+" ki Table");
		for(int i =1; i<=10; i++) {
			
			System.out.println(num+"*"+i+"="+(num*i));
		}
	}
}
