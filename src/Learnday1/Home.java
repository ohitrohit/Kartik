package Learnday1;

class Home 
{
    void foundation()
    {
    	System.out.println("first step");
    }
    void beam()
    {
    	System.out.println("second step");
    }
}
class Homev2 extends Home
{
	void colume()
	{
		System.out.println("with second step");
	}
	void wall()
	{
		System.out.println("for protection verry impotant");
	}
	void roof()
	{
		System.out.println("final step for raw house");
	}
}
class Mainclass2
{
	public static void main(String[] args) 
	{
		Home h1 = new Homev2();
		h1.foundation();
		h1.beam();
	}
}