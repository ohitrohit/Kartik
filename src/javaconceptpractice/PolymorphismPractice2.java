package javaconceptpractice;
//this is the mexamle of run time polymorphism becouse methods exicution decide on calling time

class Villan{
	public void hero() {
		System.out.println("hero ke class");
	}
}
class Villan2 extends Villan{
	public void hero() {
		System.out.println("hero lekin villen2 ka");
	}
}
public class PolymorphismPractice2 {

	public static void main(String[] args) {
		
		Villan v = new Villan2();
		v.hero();
		
		//in this methods if we do upcasting then only we can use overridden methods  means than we can decide exicution on run time
	}
}
