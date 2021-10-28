package Home_Works.lesson_2;

import java.util.Scanner;

public class HomeWork_Lesson_2 {
        static Scanner sc = new Scanner(System.in);

        public static void main (System [] args){
            System.out.println(task1());
            task2();
            task3();
            task4("Hello World",5);
            System.out.println(task5(1900));
        }

        public static boolean task1 (){
            System.out.print("Введите число a:");
            int a = sc.nextInt();
            System.out.print("Введите число b:");
            int b = sc.nextInt();
            int s = a + b;
            if (s >=10 && s <= 20) {
                return true;
            }
            return false;
        }

        public static void task2 (){
            System.out.print("Введите число a:");
            int a = sc.nextInt();
            System.out.println(a < 0 ? "Число отрицательное" : "Число положительное" );
        }

        public static void task3 (){
            System.out.print("Введите число a:");
            int a = sc.nextInt();
            boolean bul = true;
            if (a<=0 && bul) {
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        }

        public static void task4 (String str,int a){
            for (int i = 1; i <= a; i++) {
                System.out.println("[" + i + "]" + " " + str);
            }
        }

        public static boolean task5 (int year){
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                return true;
            } else {
                return false;
            }
        }
}
