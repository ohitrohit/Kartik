package Learnday1;
import java.util.Iterator;

class Student
{
	String emailid;
	String name;
	String course;
	public Student(String emailid,String name,String course)
	{
		this.emailid = emailid;
		this.name =name;
		this.course=course;
	}
	public String toString()
	{
		return "Student[emailid="+emailid+",name="+name+",course="+course+"]";
	}

}
public class Program22 
{
    public static void main(String[] args) 
    {
    	Student []s1 = new Student[3];
    	Student user1= new Student("abc@h.mail","ram","testing");
    	s1[0]=user1;
    	Student user2= new Student("def@h.mail","shyam","java");
    	s1[1]=user2;
    	Student user3= new Student("ghj@h.mail","ghanshyam","data science");
        s1[2]=user3;
        
    		for(int i=0; i<s1.length; i++)
    		{
    			System.out.println(s1[i]);
    		}
	}
}
