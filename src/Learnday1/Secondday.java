package Learnday1;

public class Secondday 
{
    void task(char a)
    {
    	System.out.println("do the task");
    }
    void task(int a)
    {
    	System.out.println("make excuse");
    }
    void task(String a)
    {
    	System.out.println("something better");
    }
    void task(boolean a)
    {
    	System.out.println("allwaye true");
    }
}
class Mainclass
{
	public static void main(String[] args) 
	{
		Secondday m1= new Secondday();
		m1.task("rohit");
	}
}
