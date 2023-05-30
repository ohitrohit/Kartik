package javaconceptpractice;

import java.util.HashMap;

public class CollectionFrameWorkPractice3 {

	public static void main(String[] args) {
		
		HashMap<String,Integer> courses = new HashMap<>();
		
		//adding element
		courses.put("Core Java",4000);
		courses.put("Basic Python",3500);
		
		System.out.println(courses);
		System.out.println("----------------");
		
		courses.forEach((key,value)->{
			System.out.print(key);
			System.out.print("=>");
			System.out.print(value);
			System.out.println();
		});
		System.out.println("-------------------------");
		System.out.println(courses.get("Core Java"));
	}
}
