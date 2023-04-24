package programingClasses;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the physcics marks:");
		int p = sc.nextInt();
		System.out.println("Enter the chemistry marks:");
		int c = sc.nextInt();
		System.out.println("Enter the math marks:");
		int m = sc.nextInt();
		
		double grandtotal=300;
		double total =p+c+m;
		double avrage=total/grandtotal;
		double percent=avrage*100;
		System.out.println("grandtotal is :"+grandtotal);
		System.out.println("total is:"+total);
		System.out.println("avrage is "+avrage);
		System.out.println("percent is "+percent+"%");
	}
}
