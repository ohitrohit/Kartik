package javaconceptpractice;

class Parent{
	void hi() {
		System.out.println("way of meeting someone");
	}
}
class Child extends Parent{
	void bye() {
		System.out.println("way of saying bye to some one");
	}
}
public class UpCastingPractice {

	public static void main(String[] args) {
		
		Parent s1 = new Child();
		s1.hi();
		
		
	}
}
