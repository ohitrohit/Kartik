package Learnday1;

interface Ott
{
	void watch();
	void download();
}
class Netflix implements Ott
{
	public void watch()
	{
		System.out.println("watch on netflix");
	}
	public void download()
	{
		System.out.println("download by netflix");
	}
}
class Hotstar implements Ott
{
	public void watch()
	{
		System.out.println("watch on hotstar");
	}
	public void download()
	{
		System.out.println("download by hotstar");
	}
}
class Amazonprime implements Ott
{
	public void watch()
	{
		System.out.println("watch on prime");
	}
	public void download()
	{
		System.out.println("download by prime");
	}
}
class Entertrainment 
{
	Ott enjoye(char select)
	{
		if (select=='n')
		{
			return new Netflix();
		}
		else if (select=='a')
		{
			return new Amazonprime();
		}
		else 
		{
			return new Hotstar();
		}
	}
}

public class Program7 
{
    public static void main(String[] args) 
    {
    	Entertrainment ref= new Entertrainment();
    	Ott o1=ref.enjoye('a');
    	o1.watch();
    	o1.download();
    	
	}
}
