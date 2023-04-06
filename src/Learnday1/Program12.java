package Learnday1;

class One
{
	
}
class Two
{
	public int hashcode()
	{
		return 37850;
	}
	public String toString()
	{
		return "Love";
	}
}

public class Program12 
{
    public static void main(String[] args) 
    {
		One o1 =new One();
		int value=o1.hashCode();
		System.out.println(value);
		String value2=o1.toString();
		System.out.println(value2);
		System.out.println("------------------");
		Two t1=new Two();
		int value3= t1.hashcode();
		System.out.println(value3);
		String value4= t1.toString();
		System.out.println(value4);
	}
}
