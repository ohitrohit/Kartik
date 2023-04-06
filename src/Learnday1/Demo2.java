package Learnday1;

class Open
{
	int pin=1234;
}
class Laptop
{
	void openlaptop(Open o1)
	{
		System.out.println("open laptop");
		System.out.println(o1.pin);
	}
	
}
public class Demo2 
{
   public static void main(String[] args) 
   {
	  Laptop l1=new Laptop();
	  l1.openlaptop(new Open());
   }
}
