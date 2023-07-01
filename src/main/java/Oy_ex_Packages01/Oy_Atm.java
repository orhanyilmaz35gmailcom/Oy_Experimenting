package Oy_ex_Packages01;

import java.util.Scanner;

public class Oy_Atm {
    /*Q01
    Bakiye (baslangic bakiyesi 1000 tl)
    ögrenme,
    para yatirma
    cekme
    cikis
    islemlerinin yapildigi bir ATM app. method create ediniz.*/

    double bakiye = 1000;
    double para;
    Scanner input = new Scanner(System.in);
    int secenek;

    public void bakiyeOgren() {
        System.out.println("bakiyeniz : " + bakiye);
        start();
    }

    public double paraYatir() {
        System.out.println("yatirmak istediginiz miktari giriniz");
        para = input.nextDouble();
        bakiye = bakiye + para;
        start();
        return bakiye;

    }

    public double paraCek() {
        System.out.println("cekmek istediginiz miktari giriniz");
        para = input.nextDouble();


        if (bakiye >= para) {
            bakiye = bakiye - para;
            start();

        } else {
            System.out.println("bakiyeniz yetersiz");

        paraCek();}
        return bakiye;
    }

    public void cik() {
        System.out.println("bizi tercih ettiginiz icin tsk");

    }

    public void start() {
        System.out.println("para yatirmak icin     1\n" +
                "para cekmek icin       2\n" +
                "bakiye ogrenmek icin   3\n" +
                "cikis icin             4\n" +
                "tuslayiniz");
        secenek = input.nextInt();

        switch (secenek) {
            case 1:
                paraYatir();
                break;
            case 2:
                paraCek();
                break;
            case 3:
                bakiyeOgren();
                break;
            case 4:
                cik();
            default:
                System.out.println("hayali giris.lutfen uygun secenek giriniz");

        }
    }
}
