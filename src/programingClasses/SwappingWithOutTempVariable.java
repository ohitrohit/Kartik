package programingClasses;

import java.util.Scanner;

public class SwappingWithOutTempVariable {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value of a");
	int a = sc.nextInt();
	System.out.println("enter the value of b");
    int b = sc.nextInt();
    System.out.println("a="+a);
    System.out.println("b="+b);
    System.out.println("-------value after swapping-----------");
    
    a=a+b; //30=10+20
    b=a-b; //20=30-10
    a=a-b; //10=30-20
    
    System.out.println("a="+a);
    System.out.println("b="+b);
    
	
	
	
	
    }
}