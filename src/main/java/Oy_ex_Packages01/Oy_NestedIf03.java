package Oy_ex_Packages01;

import java.util.Scanner;

public class Oy_NestedIf03 {
    public static void main(String[] args) {

Scanner input  = new Scanner(System.in);
       System.out.println("lütfen pasword giriniz");
       String pswgirdi=input.nextLine();

      char firstchar= pswgirdi.charAt(0);

        if (firstchar>='A' && firstchar<='Z') { if (firstchar == 'A') {System.out.println("gecerli pasword");} else { System.out.println("gecersiz pasword buyuk harf ama A degil"); }

            }else if (firstchar>='a' && firstchar<='z')


            {if (firstchar == 'z') {System.out.println("gecerli pasword");} else {System.out.println("gecersiz pasword kucuk ama z degil");}

            }else {System.out.println("hatali giris yaptiniz");}





        }
    }

