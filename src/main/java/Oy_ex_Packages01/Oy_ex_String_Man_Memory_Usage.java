package Oy_ex_Packages01;

public class Oy_ex_String_Man_Memory_Usage {
    public static void main(String[] args) {


        String bosmu="1";
       boolean sonuc= bosmu.isEmpty();
        System.out.println("bos  " + sonuc);

        String bosluklu=" ";
   boolean hiclendi= bosluklu.replace(" ","").isEmpty();
        System.out.println("boslukyok = " + hiclendi);

        String r="Java is hard to learn";

        int idxA=r.indexOf('a');
        System.out.println("idxA = " + idxA);
        int idxI=r.indexOf('i');
        System.out.println("idxI = " + idxI);
        int idxE=r.indexOf('e');
        System.out.println("idxE = " + idxE);
        System.out.println(idxE+idxA+idxI);

        String h="Ah Java vah Java sen neymissin be Java:)";
        int bak=h.indexOf("java");
        System.out.println("bak" +bak);

      int endIdxA=r.lastIndexOf('a');
        System.out.println("endIdxA = " + endIdxA);
        int endIdxI= r.lastIndexOf('i');
        System.out.println("endIdxI = " + endIdxI);
        int endIdxE= r.lastIndexOf('e');
        System.out.println("endIdxE = " + endIdxE);

        System.out.println(endIdxE+endIdxA+endIdxI);


        String email="oorhanyilmaz35@gmail.com";
        int startIndx=email.indexOf('@')+1;
        int endIndx=email.indexOf('.');
       String emailinBirKismi= email.substring(startIndx,endIndx);
        System.out.println(emailinBirKismi);

        String o="Orhan YILMAZ";
        String y="Orhan Yilmaz";
        System.out.println(o==y);

        System.out.println("o.equalsIgnoreCase(y) = " + o.equalsIgnoreCase(y));


    }
}
