package Доп;

import java.util.Scanner;

public class задания {
  static Scanner sc = new Scanner(System.in);
    public static void main( String[] args){
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

}
