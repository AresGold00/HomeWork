package Home_Works.lesson_3;

import java.util.Scanner;

public class MyArrayUtil {
    public static void printArray(int[] arr){


    }
    public static void task_1 () {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int arrl = arr.length;
        for (int i = 0; i < arrl; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println("task_1");
        for (int i = 0; i < arrl; i++) {
            System.out.println(i + "-" + arr[i]);
        }

    }
}
