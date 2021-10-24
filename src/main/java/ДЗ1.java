import java.util.Scanner;

public class ДЗ1 {
    private static Scanner scanner= new Scanner(System.in);

    public static void main (String[] args){
            printThreeWords("Orange" + "\n" + "Banana" + "\n" + "Apple" + "\n" );
        checkSumSign();
        printColor();
        compareNumbers();

    }
    public static void  printThreeWords (String s){

        for ( int i = 0; i < 3; i++) {
            if ( i != 3) System.out.print(s + " ");
            else System.out.println(s);
        }
    }
    public static void checkSumSign () {
        int a=-14;
        int b=20;
        int c = a + b;
            if (c >= 0) {
                System.out.println("Сумма положительная");
            } else System.out.println("Сумма отрицательная");

    }
    public static void printColor (){
        int value = 100;
        if (value<=0)
            System.out.println("Red");
        else if (value > 0 & value <= 100)
            System.out.println("Yellow");
        else System.out.println("Green");
    }
    public static void compareNumbers (){

        int a = 25;
        int b = 60;
        if (a>=b)
            System.out.println("a >= b");
        else System.out.println(a < b);
    }
}
