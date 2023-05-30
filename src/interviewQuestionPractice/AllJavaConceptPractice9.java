package interviewQuestionPractice;
class Hero{
	void Hero() {
		System.out.println("Hero");
	}
	void Hero(String a) {
		System.out.println("Hero with string");
	}
}
class Hero2{
	void Hero() {
		System.out.println("Hero2");
	}
}


public class AllJavaConceptPractice9 {

	int a;
	int b;
	public static int Add(int a, int b) {
		int add=a+b;
		return add;
	}
	public static void main(String[] args) {
		System.out.println(Add(200, 3000));
		
		Hero h = new Hero();
		h.Hero("Rohit"); //complile time polymorphism
		Hero2 h1 = new Hero2();
		h1.Hero();  //run time polymorphism
	}
}
