package interviewQuestionPractice;

public class AllJavaConceptPractice6 {

	public static void main(String[] args) {
		System.out.println("exception handling");
		
		try {
			System.out.println("try1");
			int a=1/0;
			System.out.println("try last");
		}
		catch(Exception ref){
			System.out.println("understands");
			ref.printStackTrace();
		}
		finally {
			System.out.println("finally block");
		}
	}
}
