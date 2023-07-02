package Oy_Ternary;

import java.util.Scanner;

public class Oy_Ternary01 {
    public static void main(String[] args) {

       /* Scanner input = new Scanner(System.in);

        System.out.println("bir tam sayi girin");

        int tamsayi = input.nextInt();
        String str = tamsayi % 2 == 0 ? "cift sayi" : "teksayi";
    System.out.println(tamsayi % 2 == 0 ? "cift sayi" : "teksayi");

        System.out.println(str);


        int ilktam=10;
        int ikitam=-15;

        System.out.println(ilktam >= 0 && ikitam >= 0 ? ilktam * ikitam : "carpma nasil yapilir bilmiyorum");*/

        Scanner input=new Scanner(System.in);

        System.out.println("iki sayi giriniz");

        double ilksayi=input.nextDouble();
        double ikincisayi=input.nextDouble();
        System.out.println(
                ilksayi+ikincisayi>ilksayi*ikincisayi? "fazlalikli sayi":"fazlaliksiz sayi"


        );


    }


}
