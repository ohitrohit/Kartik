package Learnday1;

public class Program15 
{
    public static void main(String[] args) 
    {
		
	   
	   String v1="java";
	   System.out.println(v1);
	   
	   String v2=new String("java");
	   System.out.println(v2);
	   System.out.println("here adds of the ref variable compare");
	   System.out.println(v1==v2);
	   System.out.println("here content it self compare");
	   boolean ref = v1.equals(v2);
	   System.out.println(ref);
	   
	}
}
