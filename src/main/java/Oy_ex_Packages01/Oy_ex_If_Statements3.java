package Oy_ex_Packages01;

import java.util.Scanner;

public class Oy_ex_If_Statements3 {
    public static void main(String[] args) {


Scanner input =new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
     char boyut=input.next().charAt(0);

        if (boyut>='A' && boyut<='Z'){
            System.out.println("büyük");

        } else if (boyut>='a' && boyut<='z'){
            System.out.println("kücüktür");
        }else {
            System.out.println("harf degil");
        }


    }
}

