package javaconceptpractice;


interface A1{
	void a();
	void b();
	void c();
	void d();
}
class Actual implements A1{
	
	public void a() {
		System.out.println("i am a");
	}
	public void b() {
		System.out.println("i am b");
	}
	public void c() {
		System.out.println("i am c");
	}
	public void d() {
		System.out.println("i am d");
	}
	
}
public class AbstractionPractice {

	public static void main(String[] args) {
		
		A1 ref = new Actual();
		ref.a();
		ref.b();
		ref.c();
		ref.d();
		System.out.println("Abstraction achived by interface");
	}
}
