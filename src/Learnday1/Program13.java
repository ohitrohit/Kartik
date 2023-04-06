package Learnday1;

class Raj
{
	int age;
	String fullname;
	public Raj(int age,String fullname)
	{
		this.age=age;
	    this.fullname=fullname;
	}
	
}
 
public class Program13 
{
   public static void main(String[] args) 
   {
	  Raj r1= new Raj(27,"rohitlodhi");
	  Raj r2= new Raj(27,"rohitlodhi");
	  System.out.println(r1);
	  System.out.println(r2);
	  
	  System.out.println(r1==r2);
	  
   }
}
