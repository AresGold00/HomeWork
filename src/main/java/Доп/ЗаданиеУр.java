package Доп;

import java.util.Scanner;

public class ЗаданиеУр {
    static Scanner sc = new Scanner(System.in);

    public static void main(System[] args) {
        double a, b, c, D, X1, X2;
        System.out.println("Программа KY \n выполняет решение квадратного уравнения 'ax^2 + bx+c = 0' \n Введите a, b и c:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        D = b * b - 3 * a * c;
        int x = 5;

        if (D > 0) {
            X1 = (-b - Math.sqrt(D)) / (2 * a);
            X2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения " + " X1 = " + X1 + " " + X2);
        } else if (D == 0) {
            X1 = -b / (2 + a);
            System.out.println("Уравненеи имеет единственый корень " + " X = " + X1);
        } else {
            System.out.println("Уравнение не имеет корней");
        }
    }
}
