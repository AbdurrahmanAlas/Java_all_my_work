package OOP_TAMAMI;

import java.util.Scanner;

public class faktorielFonksiyonlu {

    //Kullanıcı tarafından girilen sayının faktoriyelini hesapla

    /* VARİABLES

    1-Kullanıcı tarafından girilen sayı
    2-sonuc


     */

    public static void main(String[] args) {

        Faktoriyel();

    }

    static  void Faktoriyel(){

        Scanner scan=new Scanner(System.in);
        System.out.println("Sayı :");
        int sayi=scan.nextInt();
        int faktoriel=1;
        while (sayi>0){

            faktoriel*=sayi;
            sayi--;
        }


        System.out.println( "faktoriel : " +faktoriel);

    }

}
