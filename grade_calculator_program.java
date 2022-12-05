import java.util.Scanner;

public class grade_calculator_program {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        int fizik,matematik,türkce,kimya,müzik,tarih;
        double sonuc;

        System.out.print("Fizik notunuz :");
        fizik=input.nextInt();

        System.out.print("Matematik notunuz :");
        matematik=input.nextInt();

        System.out.print("Türkçe notunuz :");
        türkce=input.nextInt();

        System.out.print("Kimya notunuz :");
        kimya=input.nextInt();

        System.out.print("müzik notunuz :");
        müzik=input.nextInt();

        System.out.print("Traih nnotunuz :");
        tarih=input.nextInt();

        sonuc=(fizik+matematik+kimya+tarih+türkce+müzik)/6.0;

        System.out.print("ORtalamanız :" +sonuc);





    }


}
