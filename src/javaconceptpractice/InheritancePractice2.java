package javaconceptpractice;

class Demo{
	
	String a ;
	Demo(String a){
		System.out.println("demo constructor");
		this.a=a;
	}
}
class Demo2 extends Demo{
	
	int b;
	Demo2(int b){
		super("rohit");
		System.out.println("demo2 contructer");
		this.b=b;
		
	}
}

public class InheritancePractice2 {

	public static void main(String[] args) {
		Demo2 d = new Demo2(123);
		System.out.println(d.b);
		System.out.println(d.a);
	}
}
