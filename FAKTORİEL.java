import java.util.Scanner;

public class FAKTORİEL {

    //Kullanıcı tarafından girilen sayının faktoriyelini hesapla

    /* VARİABLES

    1-Kullanıcı tarafından girilen sayı
    2-sonuc


     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi=scan.nextInt();
        Faktoriyel(sayi);

    }

    static  void Faktoriyel(int number){
        int sonuc=1;
        for (int i = 0; i <= number; i++) {

            sonuc=sonuc*i;
        }
        System.out.println(number+" !=" +sonuc);

    }







}
