package Oy_ex_Packages01;

import java.util.Scanner;

public class Oy_DoWhile_Loop02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int counter=0;
  do {
if (counter==4){
    System.out.println(" hesabiniz bloke olmustur");
    break;
}
      System.out.println("kullanici adini giriniz");
      String userName=input.next();
      System.out.println("pasword giriniz");
      String pasword=input.next();

      if (userName.equals("admin")&& pasword.equals("pwd123")){
          System.out.println("hesabina hosgeldin kardes");
          break;

         } counter++;

  }while (true);

    }
    }

