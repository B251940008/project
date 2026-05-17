package lab11;

public class Sector implements Shape{
private double a;
private double b;
private double p = 3.14;

public Sector(double a, double b) {
	this.a=a;
	this.b=b;
}
public double talbai() {
	return a*b*p;
}
public void talbaip() {
	System.out.printf("Эллипс талбай: ", talbai());
}
	}
