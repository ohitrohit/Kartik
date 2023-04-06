package Learnday1;

class Typecasting 
{
    void downcasting()
    {
    	System.out.println("first learning downcasting");
    }
    void upcasting()
    {
    	System.out.println("impotant to learn upcasting also");
    }
}
class LearningJava extends Typecasting
{
	void usejava()
	{
		System.out.println("to much use");
	}
	void forautomation()
	{
		System.out.println("verry use full for automation");
	}
}
class Mainclass1
{
	public static void main(String[] args) 
	{
		Typecasting t1 = new LearningJava();
		t1.downcasting();
		t1.upcasting();
	}
}