package javaconceptpractice;

class ContructorPractice{
	
	ContructorPractice(String st){
		System.out.println("String bala-1");
	}
	ContructorPractice(){
		this("rohit");
		System.out.println("blank-2");
	}
	ContructorPractice(boolean y){
		System.out.println("boolean-3");
	}
	
}

public class ContructorPractice4 {
 
	public static void main(String[] args) {
		ContructorPractice c = new ContructorPractice();
	
}
}