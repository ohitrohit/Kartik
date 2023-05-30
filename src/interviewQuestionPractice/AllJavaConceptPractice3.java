package interviewQuestionPractice;

class Boy{
	String name;
	int age;
	String color;
	String Sex = "male";
	public Boy() {
		this("ramesh");
		name = "Rohit";
		age =28;
		color="white";
	}
	public Boy(String n) {
		
		this.name = n;
		System.out.println("hi");
		System.out.println("----------");
		
	}
	public Boy(String name, int age,String color) {
		
		this.name=name;
		this.age=age;
		this.color=color;
	}
	public Boy( int a,String n, String c) {
		this.name=n;
		this.age=a;
		this.color=c;
		
	}
	
}
public class AllJavaConceptPractice3 {

	public static void main(String[] args) {
		Boy b = new Boy(2,"yogilal","white");
		System.out.println(b.age);
		System.out.println(b.name);
		System.out.println(b.color);
		System.out.println(b.Sex);
		System.out.println("-------------------------------");
		Boy b1 = new Boy("Vivansh",5,"white");
		System.out.println(b1.age);
		System.out.println(b1.name);
		System.out.println(b1.color);
		System.out.println(b1.Sex);
		System.out.println("---------------------------------");
		Boy b2=new Boy();
		System.out.println(b2.age);
		System.out.println(b2.name);
		System.out.println(b2.color);
		System.out.println(b2.Sex);
	}
}
