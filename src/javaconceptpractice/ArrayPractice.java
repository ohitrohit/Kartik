package javaconceptpractice;

public class ArrayPractice {

	public static void main(String[] args) {
		//syntax of array
		int[] marks = new int[4];
		marks[0]=99;
		marks[1]=95;
		marks[2]=86;
		marks[3]=98;
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		
		     //or
		System.out.println("------------------------");
		int [] mark = {85,45,787,455};
	    for(int i=0; i<mark.length; i++) {     //becouse mark.length = size 
	    	System.out.println(mark[i]);
	    }
	}
}
