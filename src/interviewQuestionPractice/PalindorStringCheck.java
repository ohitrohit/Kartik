package interviewQuestionPractice;


import java.util.Scanner;

public class PalindorStringCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give String to check");
		String Str = sc.next();
		String org_Str=Str;
		
		StringBuffer sb = new StringBuffer();
		sb.append(org_Str);
		StringBuffer rev = sb.reverse();
		
		
		
		if(org_Str.equals(rev)) {
			System.out.println(Str+"---"+"String is palendor String");
		}else
			System.out.println(Str+"----"+"String is not palendor String");
	}
}
