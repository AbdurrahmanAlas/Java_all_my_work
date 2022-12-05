import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CİRCLE_AREA {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Dairenin yarıcap degerini giriniz :");
        System.out.println("ikinci branch de degişiklik yaptım");
         int r=scan.nextInt();
         double area=Math.PI*r*r;
         double environment= 2*Math.PI*r;

        System.out.println("Dairenin alanı :"  +area   );
        System.out.println("Dairenin cevresi :" +environment);



}}
