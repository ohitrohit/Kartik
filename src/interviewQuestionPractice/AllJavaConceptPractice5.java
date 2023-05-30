package interviewQuestionPractice;

class Wipro{
	private String empname;

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
}


class Info{
	private int sal;
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal=sal;
	}
	
}
public class AllJavaConceptPractice5 {

	public static void main(String[] args) {
		
		Wipro w =new Wipro();
		w.setEmpname("rohit");
		System.out.println(w.getEmpname());
		
		Info i = new Info();
		i.setSal(600000);
		System.out.println(i.getSal());
	}
}
