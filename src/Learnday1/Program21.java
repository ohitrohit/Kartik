package Learnday1;

public class Program21 
{
   public static void main(String[] args) 
   {
	

	int [] ar = {45,32,56,12,78};
    int key =78;
    int count=0;
    for (int i=0; i<ar.length; i++)
    {
    	if(ar[i]==key)
    	{
    		count++;
    		break;
    	}
    }
    if(count==0)
    {
    	System.out.println("key not found");
    }
    else
    {
    	System.out.println("key found");
    }
    }
}