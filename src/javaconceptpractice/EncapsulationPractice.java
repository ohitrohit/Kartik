package javaconceptpractice;


class Employe{
	
	private int empid;
	
	public void setEmpId(int empid1) {
		empid = empid1; 
	}
	public int getEmpId() {
		return empid ;
	}
}
class Service{
	
	private String serid;
	
	public void setSerId(String SerId) {
		serid = SerId;
	}
	public String getSerId() {
		return serid;
	}
}
public class EncapsulationPractice {

	public static void main(String[] args) {
		Employe e = new Employe();
		e.setEmpId(100);
		System.out.println(e.getEmpId());
		
		Service s= new Service();
	    s.setSerId("Rohit");
	    System.out.println(s.getSerId());
	}
}
