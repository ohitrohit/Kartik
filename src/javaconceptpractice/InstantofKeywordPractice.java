package javaconceptpractice;

class A{
	void me() {
		System.out.println("me");
	}
}
class B extends A{
	void you() {
		System.out.println("you");
	}
}
class C extends B{
	void there() {
		System.out.println("there");
	}
}
public class InstantofKeywordPractice {

	public static void main(String[] args) {
		A ref = new B();
		ref.me();
		
		B ref2 = (B)ref;
		ref2.you();
		
		System.out.println(ref instanceof B); 
		System.out.println(ref instanceof C);
		
		if(ref instanceof B)
			System.out.println("hi");
		else
			System.out.println("bye");
		
		
		if(ref instanceof C)
			System.out.println("hi");
		else
			System.out.println("bye");
		
	}
}
