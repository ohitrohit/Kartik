package programingClasses;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter the number");
		int n = sc.nextInt();
		
		int sum=1;
		for(int i = 2; i<=n/2; i++){
			if(n%i ==0) { //calculating divisors
				sum = sum+i;  //sum of the divisor
				
			}
		}
		//comparing weather the sum of the divisor
		//is equal to the number or not
		if(sum==n) {
			System.out.println(n+":Perfect Number");
		}else {
			System.out.println(n+" :Not A Perfrct Number");
		}
		
}
}
