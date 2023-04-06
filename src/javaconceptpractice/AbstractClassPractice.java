package javaconceptpractice;

abstract class Lovely{
	abstract void run();
}
class Lovely2 extends Program1{
	void run() {
		System.out.println("abstract inheritance");
	}
	void test() {
		System.out.println("hi");
	}
}

public class AbstractClassPractice {

	public static void main(String[] args) {
		Lovely2 p1 = new Lovely2();
		p1.run();
		p1.test();
	}
}
