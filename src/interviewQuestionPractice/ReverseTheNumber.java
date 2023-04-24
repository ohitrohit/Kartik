package interviewQuestionPractice;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Padharo mare desh");
		int b = sc.nextInt();
		
		int a=123456;
		
		StringBuilder sb = new StringBuilder();
//		sb.append(a);
//		StringBuilder rev = sb.reverse();
//		System.out.println(a+"---"+rev);
		
		
	    sb.append(b);
	    StringBuilder rev2 = sb.reverse();
	    System.out.println(rev2);
		
	}
}
