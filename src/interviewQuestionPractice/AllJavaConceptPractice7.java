package interviewQuestionPractice;

class One{
	int o=1;
	
	One(){
		
		System.out.println("One");
		
	}
}
class two extends One{
	
	two(){
		System.out.println("two");
		
		
	}
}
class three extends two{
	int o=2;
	
	three(){
		
		System.out.println(super.o);
		
	}
}




public class AllJavaConceptPractice7 {

	public static void main(String[] args) {
		three t = new three();
		System.out.println(t.o);
		
	}
}
