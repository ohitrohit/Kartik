package javaconceptpractice;


class Parent1{
	void hi() {
		System.out.println("way of meeting someone");
	}
}
class Child1 extends Parent1{
	void bye() {
		System.out.println("way of saying bye to some one");
	}
}
public class DownCastingPractice {

		public static void main(String[] args) {
			
			Parent1 s1 = new Child1();
			s1.hi();
			
			System.out.println("------------downcasting start----------");
			Child1 c1 = (Child1)s1;
			c1.hi();
			c1.bye();
		}
	}


