package Learnday1;

class India
{
	void Order()
	{
		System.out.println("central gov order");
	}
}
class Mpstate extends India
{
	void Order()
	{
		System.out.println("mpgov order");
	}
}
class Upstate extends India
{
	void Order()
	{
		System.out.println("upgov order");
	}
}
class Rjstate extends India
{
	void Order()
	{
		System.out.println("rjstate order");
	}
}
class Location
{
	void live(Upstate ref)
	{
		ref.Order();
	}
}

public class Program5 
{
    public static void main(String[] args) 
    {
    	Location l1= new Location();
    	l1.live(new Upstate());
    	
	}
}
