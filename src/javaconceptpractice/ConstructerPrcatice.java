package javaconceptpractice;

public class ConstructerPrcatice {

	
		int amount ;
		String mobile;
		
		ConstructerPrcatice(){
		
			amount = 20000;
			mobile =" nokia";
			
		}
		public static void main(String[] args) {
			ConstructerPrcatice c1 = new ConstructerPrcatice();
			System.out.println(c1.amount);
			System.out.println(c1.mobile);
		}
	
}
