
package lab2;
import java.util.Scanner;
public class labbb {
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double x1 ,x2 ,x3 , y1 ,y2 ,y3, a, b, c, p, s;
    
    System.out.print("x1 toog oruulnuu: "); 
	x1= input.nextDouble();
	System.out.print("y1 toog oruulnuu: "); 
		y1= input.nextDouble();
	System.out.print("x2 toog oruulnuu: "); 
		x2= input.nextDouble();
	System.out.print("y2 toog oruulnuu: "); 
		y2= input.nextDouble();
	System.out.print("x3 toog oruulnuu: "); 
		x3= input.nextDouble();
	System.out.print("y3 toog oruulnuu: "); 
		y3= input.nextDouble();
		
		a = Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
				System.out.printf("A tal: %f",a); 
				b = Math.sqrt(((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2)));
				System.out.printf("\nB tal: %f",b); 
			c =Math.sqrt(((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1)));
				System.out.printf("\nC tal: %f",c); 
				
				p=(a+b+c)/2;
				System.out.printf("\nPerimeter : %f",p); 
				s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
				System.out.printf("\nTalbai : %f",s); 
				
		input.close();	
		
		
	}
}