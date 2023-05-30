package programingClasses;

public class ObjectClassMethods {
    public static void main(String[] args) {
	
    	Fan f1 = new Fan("Philps","pink","ceiling",4);
    	System.out.println(f1);  //before overriding==> reference of an object //classname@haxadecamil
    	                        //after overridding ==> atrributes will be printed
    	Fan f2 = new Fan("usha","red","table fan",3);
    	System.out.println(f2);
    	
    	System.out.println(f1==f2); //before overriding ==> compareing he refrense varible
    	System.out.println(f1.equals(f2)); //after overriding ==> compare the attributes of both the object
    	
    	//return an unique interger value for each and every attributes of an object
    	//return the summation of the integer value.
    	System.out.println(f1.hashcode());
    	System.out.println(f2.hashcode());
}
}

class Fan{
	String brand;
	String color;
	String type;
	int noofwing;
	
	Fan(String brand,String color,String type,int noofwing){
		this.brand=brand;
		this.color=color;
		this.type=type;
		this.noofwing=noofwing;
	}
	
	//method overriding
	public String toString() {
		return " brand: "+brand+" color:"+color+" type:"+type+" No of wings:"+noofwing;
	}
	//methods over riddling of equals methods 
	public boolean equals(Object o) {
		Fan f =(Fan)o; //downcasting
		return this.brand.equals(f.brand) && this.color.equals(color) && this.type.equals(type) && this.noofwing ==f.noofwing; 
	}
	//method overridding of hashcode method
	public int hashcode() {
		int hc1 = brand.hashCode();
		int hc2 = color.hashCode();
		int hc3 = type.hashCode();
		int hc4 = noofwing;
		return hc1+hc2+hc3+hc4;
	}
	
}
