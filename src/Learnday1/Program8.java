package Learnday1;
import java.util.Scanner;
public class Program8 
{
 public static void main(String[] args) 
 {
	System.out.println("biodata form");
	 Scanner ref= new Scanner(System.in);
	System.out.println("enter your name");
	String name = ref.next();
	System.out.println("enter your age");
	int age=ref.nextInt();
	System.out.println("enter your mobile number");
	long number = ref.nextLong();
	System.out.println("enter your email id");
	String id = ref.next();
	System.out.println("complete biodata form");
	System.out.println("name="+name);
	System.out.println("age="+age);
	System.out.println("number="+number);
	System.out.println("id="+id);
 }
}
