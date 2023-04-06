package javaconceptpractice;
class Classname{
	public String run() {
		return "ROHIT";
	}
}
public class ObjectClassPracticeHashCode {

	public static void main(String[] args) {
		
		Classname c = new Classname();
		c.hashCode();
		System.out.println(c.hashCode());
		System.out.println(c);//direct print refrence variable = tostring methods
		c.toString();
		System.out.println(c.toString());
	}
}
