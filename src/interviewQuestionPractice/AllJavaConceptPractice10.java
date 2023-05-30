package interviewQuestionPractice;

public class AllJavaConceptPractice10 {

	public static void main(String[] args) {
		String a = "you will get job soon";
//		char[] a1 = a.toCharArray();
//		for(int i =0; i<=a.length(); i++) {
//			System.out.println(a1[i]);
//		}
//		String b = a.replace("will", "");
//		System.out.println(b);
		
		
		String [] b1 = a.split("e");
		
		
		for(String sp:b1) {
			System.out.println(sp);
		}
		
		
		
		System.out.println("********************************************************");
		
		Integer a1 = 100;
		String a2 =Integer.toString(a1);
		System.out.println(a2+1);
		String ram= "1223";
		int r = Integer.parseInt(ram);
		System.out.println(r*2);
		
	}
	
	
	
}
