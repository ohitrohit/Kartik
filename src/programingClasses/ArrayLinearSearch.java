package programingClasses;

import java.util.Scanner;

public class ArrayLinearSearch {

	
	public static int linearsearch(int a[],int k) {
		for(int i =0; i<a.length;i++) { //traversing across an array
			if(k==a[i]) {
				return i; //returning the index value
			}
		}
		return -1; //searched element is not to be found means return -1
		
	}
	public static void main(String[] args) {
		int a[] = {3,5,35,45,78,65,78};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int k=sc.nextInt();
		System.out.println("index: "+linearsearch(a,k));
		
	}
}
