package lab2;
import java.util.Scanner;
public class labb {
		public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);

			Double a, b, c;
			System.out.print("a toog oruulnuu: "); 
			a = input.nextDouble();
			System.out.print("b toog oruulnuu: "); 
			b= input.nextDouble();
			
			c = a*b;
		    System.out.printf("Geometr dundaj %f", Math.sqrt(c)); 

			input.close();	
			
		}

	}

