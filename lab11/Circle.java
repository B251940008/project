package lab11;

public class Circle implements Shape{
	private double r;
	private double p = 3.14;
	public Circle(double r) {
		this.r = r;
		
	}
	public double talbai() {
		return p*r*r;
	}
	public void talbaip() {
		System.out.printf("Тойрог талбай: ", talbai());
	} 
	}
