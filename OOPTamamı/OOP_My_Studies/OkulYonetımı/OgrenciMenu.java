package OOPTamamı.OOP_My_Studies.OkulYonetımı;

import java.util.ArrayList;
import java.util.Scanner;

public class OgrenciMenu implements Islemler {

    ArrayList<Ogrenci> ogrenciList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    //KULLANICIDAN SECİM İÇİN Bİ DEGER ALACAĞIZ O YÜZDEN YAZILDI.

    void ogrMenu() {

        System.out.println("----------İŞLEMLER---------\n" +
                "1-EKLEME\n" +
                "2- ARAMA \n" +
                "3- LİSTELEME\n" +
                "4- SILME\n" +
                "5-CIKIS\n" +
                "SECIMINIZ :");


        while (true) {

            char secim = scan.next().toUpperCase().charAt(0);

            switch (secim) {
                case '1': {
                    ekleme();

                }
                case '2': {
                    arama();

                }
                case '3': {


                }
                case '4': {

                }
                case 'Q': {

                }


            }

        }

    }


    @Override
    public void ekleme() {

        System.out.println("Isım giriniz :");
        scan.nextLine();
        String isim = scan.nextLine();
        System.out.println("Soyisim giriniz :");
        String soyisim = scan.nextLine();
        System.out.println("Tc no giriniz :");
        String tc = scan.next();
        System.out.println("yas giriniz :");
        int yas = scan.nextInt();
        System.out.println("Sınıf giriniz : ");
        String sinif = scan.next();
        System.out.println("Ögrencı no giriniz :");
        int ogrno = scan.nextInt();

        //PARAMETRELİ CONSTRUCTOR KULLANARAK OBJE OLUŞTURUYORUZ.
        Ogrenci ogrenci = new Ogrenci(isim, soyisim, tc, yas, sinif, ogrno);
        ogrenciList.add(ogrenci);
        ogrMenu();

    }

    @Override
    public void arama() {

        if (!ogrenciList.isEmpty()) {  //listim boş mu dolumu kontrol eidyoruz.

            scan.nextLine();

            System.out.println("Arama yapılacak Tc no giriniz :");
            String aranacakTc = scan.nextLine();
            for (int i=0;i<ogrenciList.size();i++) {

                if (ogrenciList.get(i).getTcNo().equals(aranacakTc)) {

                    System.out.println(ogrenciList.get(i).toString());
                    ogrMenu();
                }
                else {

                    System.out.println("Tc no ya ait bir no bulunamadı.");
                }


            }


        } else {

            System.out.println("Ögrenci lisesi bos");
            ogrMenu();
        }

    }

    @Override
    public void listeleme() {

        if (!ogrenciList.isEmpty()) {

            for (Ogrenci each : ogrenciList)
            {
                System.out.println(each.toString());

            }

        } else {

            System.out.println("Ögrenci listesi boş");
            ogrMenu();


        }

    }

    @Override
    public void silme() {

        if (!ogrenciList.isEmpty()) {
            scan.nextLine();

            System.out.println("Silme yapılacak Tc no giriniz :");
            String aranacakTc = scan.next();
            for (int i = 0; i < ogrenciList.size(); i++) {

                if(ogrenciList.get(i).getTcNo().equals(aranacakTc)){
                    ogrenciList.remove(i);
                    System.out.println("tc nolu ögrenci silindi.");
                    ogrMenu();

                }
            }



        } else {

            System.out.println("Ögrenci lisesi bos");
            ogrMenu();
        }


    }

    @Override
    public void cikis() {

        AnaMenu anaMenu=new AnaMenu();
        anaMenu.anaMenu();

    }
}
