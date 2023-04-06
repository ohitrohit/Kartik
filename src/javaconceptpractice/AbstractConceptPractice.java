package javaconceptpractice;

abstract class Interview{
	abstract void apptitude();
	abstract void technical();
	abstract void humanresource();
}
abstract class Day1 extends Interview{
	void registraction() {
		System.out.println("registration");
	}
}
abstract class Day10 extends Day1{
	void apptitude() {
		System.out.println("aptitude inherited");
	}
}
class Day11 extends Day10{
	void technical() {
		System.out.println("technical inheritated");
	}
	void humanresource() {
		System.out.println("humanresource inheritated");
	}
	
}

public class AbstractConceptPractice {

	public static void main(String[] args) {
		Day11 d = new Day11();
		d.apptitude();
		d.technical();
		d.humanresource();
		d.registraction();
	}
}
