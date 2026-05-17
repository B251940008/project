package lab11;

import java.util.Scanner;
public class main {
   public static void main( String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null; 
        while (true) {
            System.out.println("\n===== ДҮРСИЙН ТАЛБАЙ ТООЦООЛОХ (Полиморфизм) =====");
            System.out.println("1. Квадрат (Square)");
            System.out.println("2. Тэгш өнцөгт (Rectangle)");
            System.out.println("3. Гурвалжин (Triangle)");
            System.out.println("4. Трапец (Trapezoid)");
            System.out.println("5. Тойрог (Circle)");
            System.out.println("6. Сектор (Sector)");
            System.out.println("7. Эллипс (Ellipse)");
            System.out.println("8. Параллелограмм (Parallelogram)");
            System.out.println("0. Гарах");
            System.out.print("Сонголтоо оруулна уу (0-8): ");
            
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Программ дууслаа. Баярлалаа!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Квадратын талыг оруул: ");
                    double side = scanner.nextDouble();
                    shape = new Square(side);
                    break;

                case 2:
                    System.out.print("Тэгш өнцөгтийн өргөнийг оруул: ");
                    double width = scanner.nextDouble();
                    System.out.print("Тэгш өнцөгтийн өндрийг оруул: ");
                    double rectHeight = scanner.nextDouble();
                    shape = new Rectangle(width, rectHeight);
                    break;

                case 3:
                    System.out.print("Гурвалжны суурийг оруул: ");
                    double base = scanner.nextDouble();
                    System.out.print("Гурвалжны өндрийг оруул: ");
                    double triHeight = scanner.nextDouble();
                    shape = new Triangle(base, triHeight);
                    break;

                case 4:
                    System.out.print("Трапецын 1-р суурийг оруул: ");
                    double b1 = scanner.nextDouble();
                    System.out.print("Трапецын 2-р суурийг оруул: ");
                    double b2 = scanner.nextDouble();
                    System.out.print("Трапецын өндрийг оруул: ");
                    double trapHeight = scanner.nextDouble();
                    shape = new Trapezoid(b1, b2, trapHeight);
                    break;

                case 5:
                    System.out.print("Тойргийн радиусыг оруул: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                    break;

                case 6:
                    System.out.print("Секторын радиусыг оруул: ");
                    double secRadius = scanner.nextDouble();
                    System.out.print("Секторын өнцгийг оруул (градусаар): ");
                    double angle = scanner.nextDouble();
                    shape = new Sector(secRadius, angle);
                    break;

                case 7:
                    System.out.print("Эллипсийн том хагас тэнхлэгийг оруул: ");
                    double a = scanner.nextDouble();
                    System.out.print("Эллипсийн бага хагас тэнхлэгийг оруул: ");
                    double b = scanner.nextDouble();
                    shape = new Ellipse(a, b);
                    break;

                case 8:
                    System.out.print("Параллелограммын суурийг оруул: ");
                    double pBase = scanner.nextDouble();
                    System.out.print("Параллелограммын өндрийг оруул: ");
                    double pHeight = scanner.nextDouble();
                    shape = new Parallelogram(pBase, pHeight);
                    break;

                default:
                    System.out.println("Буруу сонголт хийлээ! Дахин оролдоно уу.");
                    continue; 
            }

            System.out.println("\n--- Үр дүн ---");
            shape.talbaip(); 
        }

        scanner.close();
    }
}
