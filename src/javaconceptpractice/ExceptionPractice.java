package javaconceptpractice;

public class ExceptionPractice {

	public static void main(String[] args) {
		System.out.println("Wellcome");
		try {
			System.out.println("hi");
			System.out.println("hi2");
			int a = 1/0;  //forcefully error put
		}
		catch(Exception ref){
			System.out.println("mistake rectified");
			ref.printStackTrace();
			
		}
	}
}
