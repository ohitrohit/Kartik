package programingClasses;

public class StringBufferClassex {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Hello");
		System.out.println(s);
		
		StringBuffer s1= new StringBuffer("Hello");
	    System.out.println(s1);
	    System.out.println(s1==s);
	    System.out.println(s.equals(s1));
	    System.out.println(s.hashCode());
	    System.out.println(s1.hashCode());
	    System.out.println(s.hashCode()==s1.hashCode());
	}
}
