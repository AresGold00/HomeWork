package Home_Works.lesson_1;

import java.util.Scanner;

public class HomeWorkApp {
    private static Scanner scanner= new Scanner(System.in);

    public static void main (String[] args){
        printThreeWords("Orange" + "\n" + "Banana" + "\n" + "Apple" + "\n" );
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void  printThreeWords (String s){

        for ( int i = 0; i < 3; i++) {
            if ( i != 2) System.out.print(s + " ");
            else System.out.println(s);
        }
    }
    public static void checkSumSign () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = sc.nextInt();
        System.out.println("Введите число b:");
        int b = sc.nextInt();
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");

    }
    public static void printColor (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 0 до 101");
        int value = sc.nextInt();
        if (value<=0)
            System.out.println("Red");
        else if (value > 0 & value <= 100)
            System.out.println("Yellow");
        else System.out.println("Green");
    }
    public static void compareNumbers (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число а:");
        int a = sc.nextInt();
        System.out.println("Введите число b:");
        int b = sc.nextInt();
        if (a>=b)
            System.out.println("a >= b");
        else System.out.println(a < b);
    }
}
