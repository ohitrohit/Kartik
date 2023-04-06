package javaconceptpractice;

class Sample{
	int a = 10;
	void search() {
		System.out.println("hi");
		System.out.println("hi2");
	}
}
class Sample2 extends Sample{
	void status() {
		System.out.println("ram");
	}
	void life() {
		System.out.println("seeta");
	}
}
public class InheritancePractice {

	public static void main(String[] args) {
		Sample s = new Sample();
		System.out.println(s.a);
		s.search();
		
		Sample2 s2 = new Sample2();
		System.out.println(s2.a);
		s2.status();
		s2.life();
	}
}
