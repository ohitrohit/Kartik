package javaconceptpractice;

public class ExceptionPractice2 {

	public static void main(String[] args) {
		
		try {
			System.out.println("hi");
			int a = 1/0; //error put intensionlly
			
		}
		finally {
			System.out.println("important statement");
		}
	}
}
