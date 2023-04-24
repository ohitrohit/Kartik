package programingClasses;

import java.util.Scanner;

public class CalcySwitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		
		System.out.println("Plz Select the Option : \n + \n - \n * \n / \n %");
		
		char option = sc.next().charAt(0);
		
		switch(option) {
		case '+':{
			int sum = a+b;
			System.out.println("sum of the value:"+ sum);
		}
		break;
		case '-':{
			int dif = a-b;
			System.out.println("diffrence of the value:"+ dif);
		}
		break;
		case '*':{
			int mul = a*b;
			System.out.println("multipul of the value:"+ mul);
		}
		break;
		case '/':{
			float div = a/b;
			System.out.println("division of the value:"+ div);
		}
		break;
		case '%':{
			 float rem = a%b;
			System.out.println("reminder of the value:"+ rem);
		}
		break;
		default:{
			System.out.println("plz select the valid data");
		}
		}
		
	}
}
