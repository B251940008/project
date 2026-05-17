package lab11;

public class Square implements Shape{
	private double a;
	
	public Square(double a) {
		this.a = a;
	}
	public double talbai() {
		return a * a ;
	}
	
	public void talbaip() {
		System.out.printf("Квадратын талбай: ", talbai());
	} 

	}
