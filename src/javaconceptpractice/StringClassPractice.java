package javaconceptpractice;

public class StringClassPractice {

	public static void main(String[] args) {
		
		String a = "ROhit is the best";
		System.out.println(a.length());
		System.out.println("-------------------------");
		System.out.println(a.charAt(4));//becouse counting start from 0
		System.out.println("--------------------------");
		char[] a1 = a.toCharArray();
		for(int i=0 ; i<a1.length ; i++ ) {
			System.out.println(a1[i]);
		}
		System.out.println("--------------------------");
		System.out.println(a.toLowerCase());
		System.out.println("-----------------------------");
		System.out.println(a.toUpperCase());
		System.out.println("------------------------------");
		System.out.println(a.indexOf('t',13));
		System.out.println("------------------------------");
		String a2 ="mann mera@tera";
		String [] b=a2.split("@");
		for(String c:b) {
			System.out.println(c);
		}
		System.out.println("---------------------------------");
		String[] b2 = a.split("t",3);
		for(String c2 : b2) {
			System.out.println(c2);
		}
	}
}
