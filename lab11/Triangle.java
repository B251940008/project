package lab11;

public class Triangle implements Shape{
	private double a;
	private double b;
	public Triangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double talbai() {
		return (a * b) / 2;
		
	}

	public void talbaip() {
		System.out.printf("Гурвалжин талбай : ", talbai());
	}
	}
