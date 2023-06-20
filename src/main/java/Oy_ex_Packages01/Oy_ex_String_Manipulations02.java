package Oy_ex_Packages01;

import java.util.Scanner;

public class Oy_ex_String_Manipulations02 {
    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen parolanizi giriniz: ");
        String pwd= input.nextLine();

        boolean first= pwd.length()>7;
        System.out.println("first = " + first);

        boolean second=!pwd.contains(" ");
        System.out.println("second = " + second);

        boolean third=pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("third = " + third);

        boolean fourth=pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("fourth = " + fourth);

        boolean fifth=pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("fifth = " + fifth);


    }
}
