package javaconceptpractice;

public class WrapperClassPractice {

	public static void main(String[] args) {
		int a= 10;
		
	//	Integer ab = new Integer(a);//called boxing // line means this value already store so use new one dont use this one becouse someone can change this one 
		
		Integer ab = a;  //autoboxing 
		System.out.println(ab);
		
		
		String b = "12";
		int b1=Integer.parseInt(b); //convert string datatype into int datatype 
		System.out.println(b1*2);
	}
}
