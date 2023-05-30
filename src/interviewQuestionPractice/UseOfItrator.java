package interviewQuestionPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class UseOfItrator {

	public static void main(String[] args) {
		ArrayList name =new ArrayList<>();
		name.add("Rohit");
		name.add("Job");
		
		System.out.println(name);	
		
		ArrayList id = new ArrayList<>();
		id.add(2);
		id.add(3);
		
		Iterator str = name.iterator();
		while(str.hasNext()) {
			System.out.println(str.next());
		}
		
		Iterator in= id.iterator();
		while(in.hasNext()) {
			System.out.println(in.next());
		}
		System.out.println("--------------------------------------------");
	
	   LinkedList list = new LinkedList();
	   list.add("Rohit");
	   list.add("Salary");
	   list.add("Wroking on newfound info tech");
	   int size = list.size();
	   System.out.println(size);
	   System.out.println(list.get(1));
	   
	   Iterator l = list.iterator();
	   while(l.hasNext()) {
		   System.out.println(l.next());
	   }
	   
	   System.out.println("------------------------------------");
	   TreeSet tr = new TreeSet();
	   tr.add("jenny lux");
	   tr.add("luxury mur");
	   tr.add("alina rai");
	   Iterator im = tr.iterator();
	   while(im.hasNext()) {
		   System.out.println(im.next());
	   }
	   
	   System.out.println("----------------------------------------------");
	   
	   HashMap<String ,Integer> hr = new HashMap<>();
	   hr.put("Luxury mur", 50000);
	   hr.put("jenny lux", 30000);
	   hr.put("alina rai", 20000);
	   
	   hr.forEach((key, value)->{
		   System.out.print(key);
		   System.out.print(" = ");
		   System.out.print(value);
		   System.out.println();
	   });
	   
	   
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
