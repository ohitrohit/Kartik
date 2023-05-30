package interviewQuestionPractice;

class sachin{
	void run() {
		System.out.println("run");
	}
}
class virat extends sachin{
	void run2() {
		System.out.println("run2");
	}
}
class rohit extends virat{
	void run3() {
		System.out.println("run3");
	}
}


public class AllJavaConceptPractice4 {

	public static void main(String[] args) {
		
		virat s = new rohit();
		s.run();
		
		
		
		rohit r = (rohit)s;
		r.run3();
		System.out.println(s instanceof rohit);
	}
}
