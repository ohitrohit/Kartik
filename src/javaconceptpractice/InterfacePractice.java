package javaconceptpractice;
interface client{
	void input();
	void output();
}
class InterfacePractice implements client{
	public void input() {
		System.out.println("Hi");
	}
	public void output() {
		System.out.println("bye");
	}
	public static void main(String[] args) {
		InterfacePractice r =new InterfacePractice();
		r.input();
		r.output();
	}
}
