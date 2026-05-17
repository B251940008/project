package lab11;

public class Trapezoid implements Shape{
	private double a;
	private double b;
	private double h;
	
	public Trapezoid(double a, double b, double h) {
		this.a = a;
		this.b = b;
		this.h = h;
	}
	public double talbai() {
		return (h*(a+b))/2;
		
	}
	public void talbaip() {
		System.out.printf("Трапец талбай: ", talbai());
	}
	
	}
