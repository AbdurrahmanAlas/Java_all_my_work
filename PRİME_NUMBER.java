import java.util.Scanner;

public class PRİME_NUMBER {

    //Kullanıcı tarafından girilen sayının asal olup olmadığını method ile bul

    /* VARİABLES
    1-Kullanıcı tarafından girilen sayı
    2-sayac



     */

    static  boolean asalMi(int number){

        int sayac=0;
        for (int i = 2; i < number ; i++) {

            if(number%i==0){

                sayac++;
            }
        }
        if(sayac==0){
            return  true;
        }else {
            return  false;
        }
    }



    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int number=scan.nextInt();

        if(asalMi(number)){

            System.out.println("Girilen sayı asal sayıdır");
        }
        else {
            System.out.println("Girilen sayı asal degildir.");
        }




    }
}
