import java.util.Scanner;

public class DIZIDE_EN_BUYUK_DEGER {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int enbuyuk=0;

          /* en buyuk elemanını bulabilmek icin
        "enbuyuk" degıskenıne en kucuk degeri veriyoruz*/

        int [] dizi=new int[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("Dizinin" +(i+1) + ".elemanını giriniz : ");
            dizi[i]=scan.nextInt();
            if(dizi[i] >enbuyuk){

                enbuyuk=dizi[i];
            }
        }
        System.out.println("Dizinin en buyuk elemanı : " +enbuyuk);



    }
}
