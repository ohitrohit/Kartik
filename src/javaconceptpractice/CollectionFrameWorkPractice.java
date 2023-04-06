package javaconceptpractice;
//import util package{all classes}
import java.util.*;
public class CollectionFrameWorkPractice {

	public static void main(String[] args) {
		
		 /*
		  creating collection
		  1-Type Safe- same type of element (object) are added to collection
		  2-un type safe- diffrent type of element can be added to collection
		  */
		
		//type safe collection
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Duregesh");
		names.add("Sitara");
		names.add("Roshni");
		names.add("vandana");
		names.add("vandana");
		System.out.println(names);
		System.out.println(names.get(0));
		System.out.println(names.get(2));
		
		System.out.println("----------------------------------");
		
		//untype safe
		LinkedList list = new LinkedList();
		list.add("sachin");
		list.add(101);
		list.add(625.8451);
		list.add(true);
		System.out.println(list);
		
		names.remove(1);
		System.out.println(names);
		
		//size
		
		System.out.println("SIZE = "+names.size());
		
		//item are there are or not
		
		System.out.println(names.contains("Durgesh"));
		
		//check for empty
		
		System.out.println(names.isEmpty());
		
		System.out.println("------------------------");
		
		names.set(1, "Ram");
		System.out.println(names);
		
		names.add(1,"Seeta");
		System.out.println(names);
		
		System.out.println("******************");
		
		Vector<String> vector = new Vector<>();
		vector.addAll(names);
		System.out.println("VECTOR" +vector);
		
		System.out.println("****************************");
		
		HashSet<Double> nms = new HashSet<>();
		nms.add(14.25);
		nms.add(34.54);
		nms.add(new Double(2345.545)); //becouse autoboxing automatically provided by java
		nms.add(99.36);
		nms.add(5.5);
		
		System.out.println(nms);
		
		System.out.println("***************************");
		TreeSet<Double> tset = new TreeSet<>();
		tset.addAll(nms);
		System.out.println(tset);
	}
}
