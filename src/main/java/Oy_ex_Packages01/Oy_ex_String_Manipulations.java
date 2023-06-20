package Oy_ex_Packages01;

public class Oy_ex_String_Manipulations {

    public static void main(String[] args) {




        String name=" Orhan Yilmaz ";
      char ilkharf=name.trim().toUpperCase().charAt(0);

      char ikinciharf=name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("" + ilkharf+ikinciharf);





    }
}
