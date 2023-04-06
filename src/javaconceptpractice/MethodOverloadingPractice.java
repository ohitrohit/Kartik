package javaconceptpractice;

class Father{
	static void house() {
		System.out.println("1947 model house...");
	}
}
class Son extends Father{
	static void house() {
		System.out.println("renovate house...");
	}
}
public class MethodOverloadingPractice {

	public static void main(String[] args) {
		Son s = new Son();
		s.house();
		Father f = new Father();
		f.house();
		
	}
}
