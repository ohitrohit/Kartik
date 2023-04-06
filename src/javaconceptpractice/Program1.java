package javaconceptpractice;

public class Program1 {
public static void main(String[] args) {
	int a = 10;
	int b= 2;
	int res= (a++ + ++b - ++a - --b);
	System.out.println(res);
	
}
}
