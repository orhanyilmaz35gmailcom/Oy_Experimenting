package Oy_ex_Packages01;

import java.util.Scanner;

public class Oy_NestedLoop2 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("satirsayisi");
        int satir=input.nextInt();


        System.out.println("sutun sayisi");
        int sutun=input.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun ; j++) {
                System.out.print(" x ");

            }
            System.out.println();

        }






        }

        


    }

