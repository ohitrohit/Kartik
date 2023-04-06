package javaconceptpractice;


class Sample3{
	Sample3(float r , char ch , long y){
		System.out.println("sample3");
	}
	
}
class Sample4 extends Sample3{
	Sample4(){
		super(3.4f,'a',561548465L);
		System.out.println("sample4");
	}
}
public class InheritancePractice3 {

	public static void main(String[] args) {
		Sample4 s = new Sample4();
	}
}
