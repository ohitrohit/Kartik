package interviewQuestionPractice;

abstract class Love{
	abstract void love();
	abstract void Girl();
	abstract void men();
	
}

abstract class Teacher extends Love{
	void mene() {
		System.out.println("my life my rules");
	}
}
class Love2 extends Teacher{
	public void love(){
		System.out.println("Love is love");
	}
	public void boys() {
		System.out.println("boys will be boys");
	}
	public void men() {
		System.out.println("men");
	}
	public void Girl() {
		System.out.println("Girl");
	}
}

public class AllJavaConceptPractice {

	public static void main(String[] args) {
		
		Love2 l = new Love2();
		l.love();
		l.boys();
		l.Girl();
		l.men();
		l.mene();
		System.out.println(l.getClass());
	}
}
