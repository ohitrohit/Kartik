package Learnday1;

class Srk
{
	
}
class Best
{
	public int hashcode()
	{
		return 786;
	}
}

public class Program11 
{
    public static void main(String[] args) 
    {
	   	Srk s1=new Srk();
	   	int value = s1.hashCode();
	   	System.out.println("Srk hashcode value="+value);
	   	
	   	Best b1=new Best();
	   	int value2= b1.hashcode();
	   	System.out.println("my give value="+value2);
	}
}
