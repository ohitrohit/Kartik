package javaconceptpractice;

// example of compile time polymorphism becouse there every thing decided in the compile time which methods are going to execute
class Hero{

	public void pizza() {
		System.out.println("pizza methods");
	}
	public void pizza(String Rohit) {
		System.out.println("pizza overloaded methods");
	}
}
public class PolymorphismPractice {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.pizza();
	}
}
