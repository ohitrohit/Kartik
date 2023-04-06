package Learnday1;

class Mobilepin
{
	int pin=1234;
	void enter()
	{
		System.out.println("validate");
	}
}
class Lockscreen
{
	void screen(Mobilepin m1)
	{
		System.out.println("open lock");
		System.out.println(m1.pin);
		m1.enter();
	}
}
public class Program3 
{
   public static void main(String[] args) 
   {
	   Lockscreen l1= new Lockscreen();
	   l1.screen(new Mobilepin() );
   }
}
