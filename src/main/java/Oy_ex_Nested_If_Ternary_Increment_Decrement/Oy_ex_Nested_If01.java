package Oy_ex_Nested_If_Ternary_Increment_Decrement;

import java.util.Scanner;

public class Oy_ex_Nested_If01 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz");
        String cinsiyet = input.next();

        System.out.println("yasinizi giriniz");
        int yas = input.nextInt();
if (yas>0 && yas<=120){
    System.out.println("yasinizi dogru giriniz");

}else if (cinsiyet.equalsIgnoreCase("kadin")) {

            if (yas>60) {
                System.out.println("emekli olabilir");
            } else {
                System.out.println("emekli olamaz");
            }
            } else if (cinsiyet.equalsIgnoreCase("erkek")) {
            if (yas>63){
                System.out.println("emekli olabilir");
            }else {
                System.out.println("emekli olamaz");
            }

        } else {
            System.out.println("tanimli degil");
        }

    }
}
