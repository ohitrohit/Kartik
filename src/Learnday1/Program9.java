package Learnday1;
import java.util.Scanner;
public class Program9 
{
public static void main(String[] args) 
{
    Scanner s1= new	Scanner(System.in);
    System.out.println("details about coaching");
    System.out.println("enter coaching name");
    String name=s1.nextLine();
    System.out.println("enter fee");
    long fee=s1.nextLong();
    System.out.println("coure cname");
    String cname =s1.next();
    System.out.println("------------------------");
    
    System.out.println("name="+name);
    System.out.println("fee="+fee);
    System.out.println("cname="+cname);
}
}
