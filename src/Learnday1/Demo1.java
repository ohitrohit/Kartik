package Learnday1;


class Manualtesting
{
	int chapter=20;
	void need()
	{
		System.out.println("verry important for testing");
	}
}
class Java extends Manualtesting
{
	int Chapter2=15;
	void need2()
	{
		System.out.println("verry important for full stack and automation both");
	}
}
public class Demo1 
{
    public static void main(String[] args) 
    {
    	Manualtesting m1= new Java();
    	System.out.println(m1.chapter);
    	m1.need();
    	
    	Java j1= (Java)m1;
    	System.out.println(j1.chapter);
    	j1.need();
    	System.out.println(j1.Chapter2);
    	j1.need2();
	}
}
