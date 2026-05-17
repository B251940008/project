package lab11;

public class Parallelogram implements Shape{
	private double b;
	private double h;
	public Parallelogram(double b, double h) {
		this.h = h;
		this.b = b;
	}
	public double talbai() {
		return b*h;
	}
	public void talbaip() {
		System.out.printf("параллелограмм талбай: ", talbai());
	}
	}
