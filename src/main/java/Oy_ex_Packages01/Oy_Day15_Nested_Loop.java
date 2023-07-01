package Oy_ex_Packages01;

import java.util.Scanner;

public class Oy_Day15_Nested_Loop {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int row = input.nextInt();

       for (int i=1 ;i<=row  ;i++){
           for ( int k=1 ; k<=i ; k++){
           System.out.print(k+ "");
       }
        System.out.println();

    }
}}
