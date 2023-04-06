package javaconceptpractice;

public class ConstructorPrcatice3 {


	int salary;
	String company;
	ConstructorPrcatice3(int salary ,String company){
		System.out.println("pass");
		this.salary=salary;
		this.company=company;
	}
	ConstructorPrcatice3(){
		System.out.println("pass2");
		salary=80000;
		company ="good";
	}
	public static void main(String[] args) {
		ConstructorPrcatice3 c = new ConstructorPrcatice3(100000,"verry good");
		System.out.println(c.salary);
		System.out.println(c.company);
		ConstructorPrcatice3 c1 = new ConstructorPrcatice3();
		System.out.println(c1.salary);
		System.out.println(c1.company);
	}
}
