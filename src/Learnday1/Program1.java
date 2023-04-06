package Learnday1;

class Tenth
{
	void allsubject()
	{
		System.out.println("learn all basic subject");
	}
}
class Twilth extends Tenth
{
	void pcm()
	{
		System.out.println("learn only specific subject basic");
	}
}
class College extends Twilth
{
	void civil()
	{
		System.out.println("learn only civil subject");
	}
}
class Education
{
	void Tenthclass(Tenth t1)
	{
		t1.allsubject();
	}
	void Twilthclass(Twilth t2)
	{
		t2.allsubject();
		t2.pcm();
	}
	void Collegeclass(College c1)
	{
		c1.allsubject();
		c1.pcm();
		c1.civil();
	}
	
}
public class Program1 
{
    public static void main(String[] args) 
    {
    	Education e1= new Education();
    	e1.Tenthclass(new Tenth());
    	e1.Twilthclass(new Twilth() );
    	e1.Collegeclass(new College());
	}
}
