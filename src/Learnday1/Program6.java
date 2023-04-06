package Learnday1;

class Upiid
{
	 void transferamount()
	{
		System.out.println("upi id");
	}
}
class Phonepay extends Upiid
{
	void transferamount()
	{
		System.out.println("using phonepay for transfer amount");
	}
}
class Gpay extends Upiid
{
	void transferamount()
	{
		System.out.println("using gpay for transfer amount");
	}
}
class Paytm extends Upiid
{
	void transferamount()
	{
		System.out.println("using paytm for transfer amount");
	}
}
class Money
{
	void Balancetransfer(Upiid ref)
	{
		ref.transferamount();
	}
}
public class Program6 
{
   public static void main(String[] args) 
   {
       Money m1= new Money();
       m1.Balancetransfer(new Phonepay());
       m1.Balancetransfer(new Gpay());
       m1.Balancetransfer(new Paytm());
   }
}
