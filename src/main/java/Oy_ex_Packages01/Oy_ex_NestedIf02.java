package Oy_ex_Packages01;

import java.util.Scanner;

public class Oy_ex_NestedIf02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir ucgenin kenar uzunluklarini giriniz");
        double x = Math.abs(scan.nextDouble());
        double y = Math.abs(scan.nextDouble());
        double z = Math.abs(scan.nextDouble());


        boolean ucgenmi=
                x+y>z && z>Math.abs(x-y) &&
                        x+z>y && y>Math.abs(x-z) &&
                        y+z>x && x>Math.abs(y-z);

        if (x<=0 || y<=0 || z<=0){
            System.out.println("gecerli uzunluk giriniz"); }

        else if (ucgenmi)
        {

            if (x == y && y == z || z == x ){System.out.println("eskenar ücgendir");}
            else if (x == y || y == z || z == x) {System.out.println("ikiz kenar ucgen");}
            else{System.out.println("cesit kenar ucgen");}

        }else{System.out.println("ucgen degil");}







    }
}

