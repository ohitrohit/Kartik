package javaconceptpractice;

class Demo1{
	int a = 45;
}
class Dance extends Demo1{
	int a = 12;
	void test() {
		System.out.println(a);
		System.out.println(super.a);
	}
}
public class InheritancePractice4 {

	public static void main(String[] args) {
		Dance d = new Dance();
		d.test();
	}
}
