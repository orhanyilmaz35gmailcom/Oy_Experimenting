package Oy_ex_Packages01;

import java.util.Scanner;

public class Oy_ex_If_Statements2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int al = input.nextInt();


        if (al % 2 == 0) {
            System.out.println("cift");
        }
        if (al % 2 != 0)
        {
            System.out.println("tekmis");
        }
    }
}

