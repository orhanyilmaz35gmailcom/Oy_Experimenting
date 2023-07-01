package Oy_ex_Packages01;

public class Oy_Loop1 {
    public static void main(String[] args) {

        String duz = "Ey edip adanada pide ye";
        String ters3 = "";

        for (int i = duz.length()-1; i>= 0; i-- ){
            ters3=ters3+duz.charAt(i);
        }

        if (duz.equalsIgnoreCase(ters3)) {
            System.out.println("polindrome");

        } else {
            System.out.println("degil");
        }

    }

}
