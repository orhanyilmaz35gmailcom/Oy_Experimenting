package Oy_ex_Packages01;

public class Oy_ex_If_Statements {
    public static void main(String[] args) {


        int a= -2;

        if (a>=0){

            System.out.println("pozitif");

        }else {
            System.out.println("negatif");
        }

            int no=11;
        if (no>-2 && no<10){
            System.out.println("Rakam");
        }else{
            System.out.println("rakam degil");
        }


        int cbasamak = -123;
        cbasamak=Math.abs(cbasamak);

        if(cbasamak>99 && cbasamak<1000){
            System.out.println( "ucbasamaklidir");
        } else if (cbasamak>0 && cbasamak<100) {
            System.out.println("iki basamaklidir");
        } else if (cbasamak>999 && cbasamak<10000) {
            System.out.println("dort basamaklidir");

        }
        System.out.println(cbasamak);

        String tek="aab";

      char sifir=tek.charAt(0);
      if (tek.indexOf(sifir)==tek.lastIndexOf(sifir)){
          System.out.println(sifir);
      }
      char bir= tek.charAt(1);
        if (tek.indexOf(bir)==tek.lastIndexOf(bir)){
            System.out.println(bir);
        }
        char iki= tek.charAt(2);
        if (tek.indexOf(iki)==tek.lastIndexOf(iki)){
            System.out.println(iki);
        }





    }
    }

