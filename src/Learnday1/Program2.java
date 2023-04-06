package Learnday1;

class Mobile
{
	void smartphone()
	{
		System.out.println("support hd");
	}
}
class Internate extends Mobile
{
	void connectivity()
	{
		System.out.println("support 4g");
	}
}
class Primemembership extends Internate
{
	void membership()
	{
		System.out.println("paid membership");
	}
}
class Watching 
{
	void Cellphone(Mobile m1)
	{
		m1.smartphone();
	}
	void Modem(Internate i1)
	{
		i1.connectivity();
	}
	void Perchase(Primemembership p1)
	{
		p1.membership();
	}
}
public class Program2 
{
	public static void main(String[] args) {
	Watching w1= new Watching();
	w1.Cellphone(new Mobile());
	w1.Modem(new Internate());
	w1.Perchase(new Primemembership());
	}
}
