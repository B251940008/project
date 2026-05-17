package lab11;
import java.util.Scanner;

public class main {
	public static void Main(String[] args) {
		Scanner input = new Scanner(System.in);
		        Shape shape = null; 

		        while (true) {
		            System.out.println("\n--- Дүрс сонгоно уу ---");
		            System.out.println("1. Square (Квадрат)");
		            System.out.println("2. Rectangle (Тэгш өнцөгт)");
		            System.out.println("3. Triangle (Гурвалжин)");
		            System.out.println("4. Trapezoid (Трапец)");
		            System.out.println("5. Circle (Дугуй)");
		            System.out.println("6. Sector (Сектор)");
		            System.out.println("7. Ellipse (Эллипс)");
		            System.out.println("8. Parallelogram (Параллелограмм)");
		            System.out.println("0. Гарах");
		            System.out.print("Сонголт: ");
		            
		            int choice = input.nextInt();

		            if (choice == 0) break;

		            switch (choice) {
		                case 1:
		                    System.out.print("Талын уртыг оруул: ");
		                    double side = input.nextDouble();
		                    shape = new Square(side);
		                    break;
		                case 2:
		                    System.out.print("Урт: ");
		                    double l = input.nextDouble();
		                    System.out.print("Өргөн: ");
		                    double w = input.nextDouble();
		                    shape = new Rectangle(l, w);
		                    break;
		                case 3:
		                    System.out.print("Суурь: ");
		                    double b = input.nextDouble();
		                    System.out.print("Өндөр: ");
		                    double h = input.nextDouble();
		                    shape = new Triangle(b, h);
		                    break;
		                case 4:
		                    System.out.print("Дээд суурь: ");
		                    double a1 = input.nextDouble();
		                    System.out.print("Доод суурь: ");
		                    double a2 = input.nextDouble();
		                    System.out.print("Өндөр: ");
		                    double th = input.nextDouble();
		                    shape = new Trapezoid(a1, a2, th);
		                    break;
		                case 5:
		                    System.out.print("Радиус: ");
		                    double r = input.nextDouble();
		                    shape = new Circle(r);
		                    break;
		                case 6:
		                    System.out.print("Радиус: ");
		                    double sr = input.nextDouble();
		                    System.out.print("Өнцөг (градус): ");
		                    double angle = input.nextDouble();
		                    shape = new Sector(sr, angle);
		                    break;
		                case 7:
		                    System.out.print("Их хагас тэнхлэг (a): ");
		                    double major = input.nextDouble();
		                    System.out.print("Бага хагас тэнхлэг (b): ");
		                    double minor = input.nextDouble();
		                    shape = new Ellipse(major, minor);
		                    break;
		                case 8:
		                    System.out.print("Суурь: ");
		                    double pb = input.nextDouble();
		                    System.out.print("Өндөр: ");
		                    double ph = input.nextDouble();
		                    shape = new Parallelogram(pb, ph);
		                    break;
		                default:
		                    System.out.println("Буруу сонголт!");
		                    continue;
		            }

		            if (shape != null) {
		                System.out.println("\n--- Үр дүн ---");
		                shape.talbai();
		                shape.talbaip();
		            }
		        }
		        
		        input.close();
		    }
		
		}
	


