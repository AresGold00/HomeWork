package Доп_Задания;

import java.util.Scanner;

public class Задания {
    static Scanner sc = new Scanner(System.in);

    public static void  main (String[] args){
        Shifr();
        Yravnenie();
    }
    public static void Shifr(){
        String str = sc.next();
        int key =1 ;
        String new_str = "";
        String d = "";
        int c= 0 ;
        int y = 0;

        System.out.println((int)'Я'); // Код буквы

        for (int i =0; i < str.length(); i++){
            c= (str.charAt(i)+ key);
            y = (c - 1040) % 32 + 1040 ;
            new_str += (char) y ;

        }
        System.out.println(new_str);

    }


    public static void Yravnenie() {
        double a, b, c, D, X1, X2;
        System.out.println(" Программа 'Квадратное уравнение' \n Вычисляет решение квадратного уравнения 'ax^2 + bx+c = 0' \n Введите a, b и c:");
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
