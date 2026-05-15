package lab7;
import java.util.Scanner;

public class Main {
	public static void main(String[] arg){
        studentManager manager = new studentManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Оюутны Удирдлагын Цэс ---");
            System.out.println("1. Оюутан нэмэх");
            System.out.println("2. Оюутан устгах");
            System.out.println("3. Оюутан хайх");
            System.out.println("4. Эрэмбэлэх (Нэрээр)");
            System.out.println("5. Бүх оюутны мэдээлэл харах");
            System.out.println("6. Гарах");
            System.out.print("Сонголт: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Нэр: ");
                    String name = sc.nextLine();
                    System.out.print("Нас: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Оюутны ID: ");
                    String id = sc.nextLine();
                    manager.addStudent(new Student(name, age, id));
                    break;
                case 2:
                    System.out.print("Устгах оюутны ID: ");
                    String removeId = sc.nextLine();
                    manager.removeStudent(removeId);
                    break;
                case 3:
                    System.out.print("Хайх оюутны ID: ");
                    String searchId = sc.nextLine();
                    Student s = manager.findStudent(searchId);
                    if (s != null) System.out.println("Олдсон: " + s);
                    else System.out.println("Оюутан олдсонгүй.");
                    break;
                case 4:
                    manager.sortByName();
                    break;
                case 5:
                    manager.printAllStudents();
                    break;
                case 6:
                    System.out.println("Программ дууслаа.");
                    break;
                default:
                    System.out.println("Буруу сонголт!");
            }
        } while (choice != 6);
        
        sc.close();
    }
}