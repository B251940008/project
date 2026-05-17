package lab11;

public class Rectangle implements Shape{
	private double a;
	private double b;
	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
		
	}
	public double talbai() {
		return a * b;
	}
	public void talbaip() {
		System.out.printf("Тэгш өнцөгт талбай: ", talbai());
	}
	}
