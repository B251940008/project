package lab6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Үйлдэл сонго (+, -, *): ");
    String op = sc.next();

    System.out.print("1-р матрицын мөр, баганын тоог оруул: ");
    int r1 = sc.nextInt();
    int c1 = sc.nextInt();
    int[][] m1 = new int[r1][c1];
    System.out.println("1-р матрицын элементүүдийг оруул:");
    for (int i = 0; i < r1; i++) 
        for (int j = 0; j < c1; j++) m1[i][j] = sc.nextInt();

    System.out.print("2-р матрицын мөр, баганын тоог оруул: ");
    int r2 = sc.nextInt();
    int c2 = sc.nextInt();


    if (op.equals("+") || op.equals("-")) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Алдаа: Нэмэх, хасах үйлдэлд матрицын хэмжээ ижил байх ёстой!");
            return;
        }
    } else if (op.equals("*")) {
        if (c1 != r2) {
            System.out.println("Алдаа: Үржих үйлдэлд 1-р матрицын багана, 2-р матрицын мөртэй тэнцүү байх ёстой!");
            return;
        }
    }

    int[][] m2 = new int[r2][c2];
    System.out.println("2-р матрицын элементүүдийг оруул:");
    for (int i = 0; i < r2; i++) 
        for (int j = 0; j < c2; j++) m2[i][j] = sc.nextInt();

    lab6 calc = new lab6(m1, m2, op);
    calc.chooseOperation();
}
}


