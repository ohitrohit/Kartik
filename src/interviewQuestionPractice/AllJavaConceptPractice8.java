package interviewQuestionPractice;

interface king{
	void money();
	void army();
}
class kingslayer implements king{
	public void money() {
		System.out.println("money is verry importatnt");
	}
	public void army() {
		System.out.println("Withou army we cant fight");
	}
	
}
public class AllJavaConceptPractice8 {

	public static void main(String[] args) {
		kingslayer ks = new kingslayer();
		ks.money();
		ks.army();
	}
}
