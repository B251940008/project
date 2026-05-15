package lab9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lab9 myClock = new lab9();

        System.out.println("=== Clock системд тавтай морил ===");
        System.out.println("1. Цагийг гараас тохируулах");
        System.out.println("2. Цагийг автоматаар тохируулах");
        System.out.print("Сонголт: ");
        int setChoice = sc.nextInt();

        if (setChoice == 1) {
            System.out.print("Жил, Сар, Өдөр, Цаг, Минут, Секунд (зайгаар тусгаарлан): ");
            myClock.setClock(sc.nextInt(), sc.nextInt(), sc.nextInt(), 
                             sc.nextInt(), sc.nextInt(), sc.nextInt());
        } else {
            myClock.autoSetClock();
        }

        System.out.println("\n--- Timer ажиллуулах ---");
        System.out.println("1. 1000 секунд ажиллуулах (Default)");
        System.out.println("2. Өөрийнхөө заасан хугацаагаар ажиллуулах");
        System.out.print("Сонголт: ");
        int tickChoice = sc.nextInt();

        if (tickChoice == 2) {
            System.out.print("Хэдэн секунд ажиллуулах вэ?: ");
            int seconds = sc.nextInt();
            myClock.tickClock(seconds);
        } else {
            myClock.tickClock();
        }
        
        sc.close();
    }
}
