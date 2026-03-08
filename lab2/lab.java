package lab2;
import java.util.Scanner;
public class lab {
			public static void main(String[] args) {
				
			    Scanner input = new Scanner(System.in);

				double p = 3.14, toirog, rad, perimeter, busluur ;
				
				System.out.print("Radiusa oruulnuu: "); 
						
			    rad = input.nextInt();
			    
			    toirog = rad * p;
			    
			    perimeter = 2 * toirog;
			    
			    busluur = perimeter * 3;
			    
			    System.out.printf("toirog iin urt: %f", toirog); 
			    System.out.printf("\nperimeter: %f", perimeter); 
			    System.out.printf("\nbusluuriin urt: %f", busluur); 

			    input.close();
			}

		}


