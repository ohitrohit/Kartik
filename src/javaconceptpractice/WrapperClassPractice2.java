package javaconceptpractice;

public class WrapperClassPractice2 {

	public static void main(String[] args) {
		
		Integer a = 225;
		int ab = a;  //Auto unboxing // Converting Int object value into primitive datatype
		System.out.println(ab);
		
		
		String c = "222.56";
		double c1 = Double.parseDouble(c); // converting String datatype into double data type 
		System.out.println(c1);
	}
}
