package lab5;
import java.util.Scanner;

public class lab5 {
	public static double mean(double a, double b) {
		return(a + b)/2;
}
	public static double mean(double a, double b, double c) {
		return(a + b + c)/3;
}
	public static double mean(double a, double b, double c, double d) {
		return(a + b + c + d)/4;
}
	public static double mean(double a, double b, double c, double d, double e) {
		return(a + b + c + d + e)/5;
}
	
	  public static double mean(double... a) {
	        double sum = 0;
	        for(double x : a) {
	            sum += x;
	        }
	        return sum / a.length;
	  }
	public static double Stdev(double a, double b) {
		double f = mean(a, b);  
		double x1 = (a - f)*(a - f);
		double x2 = (b - f)*(b - f);
	return Math.sqrt((x1 +x2)/2);
	}
	public static double Stdev(double a, double b, double c) {
		double f = mean(a, b, c);  
		double x1 = (a - f)*(a - f);
		double x2 = (b - f)*(b - f);
		double x3 = (c - f)*(c - f);
	return Math.sqrt((x1 + x2 + x3)/3);
	}
	public static double Stdev(double a, double b, double c, double d) {
		double f = mean(a, b, c, d);  
		double x1 = (a - f)*(a - f);
		double x2 = (b - f)*(b - f);
		double x3 = (c - f)*(c - f);
		double x4 = (d - f)*(d - f);
	return Math.sqrt((x1 + x2 + x3 + x4)/4);
	}
	public static double Stdev(double a, double b, double c, double d, double e) {
		double f = mean(a, b, c, d, e);  
		double x1 = (a - f)*(a - f);
		double x2 = (b - f)*(b - f);
		double x3 = (c - f)*(c - f);
		double x4 = (d - f)*(d - f);
		double x5 = (e - f)*(e- f);
		return Math.sqrt((x1 + x2 + x3 + x4 + x5)/5);
	}

	    public static double Stdev(double... a) {
	        double f = mean(a);
	        double sum = 0;

	        for(double x : a) {
	            sum += (x - f) * (x - f);
	        }

	        return Math.sqrt(sum / a.length);
	    }
	
	public static void main(String[] args){
		
	try(Scanner s = new Scanner(System.in)){
	System.out.print("Heden too oruulah ve (2-5): ");
    int n = s.nextInt();
	

    double a[] = new double[n];
    for(int i = 0; i < n; i++) {
        System.out.printf("%d-r toog oruul: ", i+1);
        a[i] = s.nextDouble();
    }

    System.out.println("\nДундаж утга = " + mean(a));
    System.out.println("Стандарт хазайлт= " + Stdev(a));
	}
	}
}