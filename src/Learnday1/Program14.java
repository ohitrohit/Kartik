package Learnday1;

class Mp
{
	String condition;
	int money;
	public Mp(String condition,int money)
	{
		this.condition=condition;
		this.money=money;
	}
}
public class Program14 
{
   public static void main(String[] args) 
   {
       Mp m1=new Mp("good",20);
       Mp m2= new Mp("good",20);
       System.out.println("here adds of the ref is compare");
       System.out.println(m1==m2);
       
   }
}
