package Oy_ex_Packages01;

import java.util.Scanner;

public class Oy_ex_NestedIf01 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen 3 sayi giriniz");
        double aKenari=Math.abs(scan.nextDouble());
        double bKenari=Math.abs(scan.nextDouble());
        double cKenari=Math.abs(scan.nextDouble());
boolean ucgenmi=aKenari+bKenari>cKenari && cKenari>Math.abs(aKenari-bKenari)
        &&
        aKenari+cKenari>bKenari && bKenari>Math.abs(aKenari-cKenari)
        &&
        bKenari+cKenari>aKenari && aKenari>Math.abs(bKenari-cKenari);

     if (ucgenmi)
     {
            if ( aKenari==bKenari && bKenari==cKenari && aKenari==cKenari){
                System.out.println( "hem ucgen hemde eskenar ucgen");
             }else {
                System.out.println("ucgen ama eskenar degil");
            }

     }else {
         System.out.println("bu bir ucgen degildir");
     }





  }
}
