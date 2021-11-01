package lessons.lesson_3;

import java.util.Random;

public class MyArrayUtil {

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");

    }

    public static void printArray(double... arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }

    public static void printArray(float[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }

    public static void printArray(int[][] arr) {
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                System.out.print(arr[y][x] + " ");
            }
        }
    }

//    public static int[] makeArrayWithRandomValues(int length) {

//        int[] arr = new [length];
//        Random random = new Random();
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = random.nextInt();
//        }
//        return arr;
//    }
}
