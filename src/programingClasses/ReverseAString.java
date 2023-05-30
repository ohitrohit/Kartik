package programingClasses;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		String s=sc.nextLine();
		
		StringBuffer sb= new StringBuffer(s);
		System.out.println(sb.reverse());
	}
}
