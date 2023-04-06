package javaconceptpractice;

public class ConstructorPractice2 {

	int amount;
	String brand;
	long number;
	
	ConstructorPractice2(int a , String b , long n){
		System.out.println("hi");
		 amount = a ;
		 brand = b;
		 number = n;
		
	}
	public static void main(String[] args) {
		ConstructorPractice2 c1 = new ConstructorPractice2(200,"rohit",9340237478l);
		System.out.println(c1.amount);
		System.out.println(c1.brand);
		System.out.println(c1.number);
	}
}
