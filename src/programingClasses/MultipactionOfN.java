package programingClasses;

import java.util.Scanner;

public class MultipactionOfN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		for(int i =1; i<=num; i++) {
			//traversing across the(n value)
			for(int j=1; j<=10; j++) //multipication
			{
				System.out.println(i+"*"+j+" = "+j*i+"\n");
				
			}
			
			System.out.println(" : NEST TABLE START");
		
		}	
			
	}
}
