package OOP_TAMAMI.OkulYonetımı;

import java.util.Scanner;

public class AnaMenu {

   /* ÖĞRETMEN VE ÖĞRENCİ YÖNETİM PANELİ
        --------------------------------------------------------------
          1- ÖĞRENCİ İŞLEMLERİ
          2- ÖĞRETMEN İŞLEMLERİ
          Q -ÇIKIŞ
    */


    void anaMenu() {
        System.out.println(" --------------------------------\n" +
                "ÖĞRETMEN VE ÖĞRENCİ YÖNETİM PANELİ \n" +
                "-------------------------------------\n" +
                " 1- ÖĞRENCİ İŞLEMLERİ\n" +
                " 2- ÖGRETMEN İŞLEMLERİ\n" +
                " Q-ÇIKIŞ \n +" +
                "  SEÇİMİNİZ :");

        Scanner scan = new Scanner(System.in);

        while (true) {
            char secim = scan.next().toUpperCase().charAt(0); //kücük q ya bassanda olur.
            switch (secim) {

                case '1': {
                    OgrenciMenu ogrenciMenu = new OgrenciMenu();
                    ogrenciMenu.ogrMenu();
                }
                case '2': {
                    OgretmenMenu ogretmenMenu = new OgretmenMenu();
                    ogretmenMenu.ogretmenMeu();
                }
                case 'q': {
                    System.out.println("Güle güle");
                    System.exit(0);
                }

                default: {

                    System.out.println("Gecerli deger giriniz");
                    anaMenu();
                }


            }


        }


    }


}
