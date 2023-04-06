package javaconceptpractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionFrameWorkPractice2 {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Duregesh");
		names.add("Sitara");
		names.add("Roshni");
		names.add("vandana");
		names.add("vandana");
		
		//for each loop:
		 for(String str:names) {
			 System.out.println(str +"\t" +str.length());
		 }
		 System.out.println("---------------------");
		 
		 //traversing using Iterator
		 
		 Iterator<String> itr = names.iterator();
		 
		 while(itr.hasNext()) {
			 String next = itr.next();
			 System.out.println(next);
		 }
		 
		 System.out.println("---------------------");
		 System.out.println("SORTING OF ELEMENTS");
		 TreeSet<String> set =new TreeSet<>();
		 set.addAll(names);
		 set.forEach(e->{
			 System.out.println(e);
		 });
		 
			
		 
	}
}
