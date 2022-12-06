package OOP_TAMAMI.OkulYonetımı;

import java.util.ArrayList;
import java.util.Scanner;

public class OgretmenMenu implements Islemler{



    ArrayList<Ogretmen> ogretmenList=new ArrayList<>();
    Scanner scan=new Scanner(System.in);

    void  ogretmenMeu() {

        System.out.println("----------İŞLEMLER---------\n" +
                "1-EKLEME\n" +
                "2- ARAMA \n" +
                "3- LİSTELEME\n" +
                "4- SILME\n" +
                "5-CIKIS\n" +
                "SECIMINIZ :");


        while (true) {

            char secim=scan.next().toUpperCase().charAt(0);
            switch (secim){
                case '1' :{

                    ekleme();

                }
                case '2' :{
                    arama();
                }
                case '3' :{
                    listeleme();
                }
                case '4' :{
                    silme();
                }
                case 'q' :{

                    cikis();
                }



            }




        }
    }


    @Override
    public void ekleme() {

        System.out.println("İsmini giriniz :");
        String isim=scan.nextLine();
        System.out.println("Soyismmini giriniz :");
        String soyisim=scan.nextLine();
        System.out.println("Ögretmen Tc no giriniz :");
        String tc=scan.next();
        System.out.println("ögretmen yaas giriniz :");
        int yas=scan.nextInt();
        System.out.println("Ögretmen bölümü giriniz :");
        String bolum=scan.nextLine();
        System.out.println("Ögretmen sicill no giriniz :");
        int sicilNo=scan.nextInt();

        Ogretmen ogretmen=new Ogretmen(isim,soyisim,tc,yas,bolum,sicilNo);
        ogretmenList.add(ogretmen);
        ogretmenMeu();



    }

    @Override
    public void arama() {

        if(!ogretmenList.isEmpty()){

            System.out.println("Arama yapılacak Tcno Giriniz :");
            String aranacakTcno=scan.next();
            for (int i = 0; i < ogretmenList.size(); i++) {



                if(ogretmenList.get(i).getTcNo().equals(aranacakTcno))
                {
                    System.out.println(ogretmenList.get(i).toString());
                }
                else {
                    System.out.println("Tc no ya ait öğretmen yok");
                    ogretmenMeu();
                }
            }



        }else {
            System.out.println("ögretmen listesi bos");
            ogretmenMeu();
        }



    }

    @Override
    public void listeleme() {

        if(!ogretmenList.isEmpty()){

            for (Ogretmen each:ogretmenList
                 ) {
                System.out.println(each.toString());
                ogretmenMeu();

            }



        }else {

            System.out.println("ögretmen listesi boş");
            ogretmenMeu();
        }


    }

    @Override
    public void silme() {


        if(!ogretmenList.isEmpty()){

            System.out.println("Silmek istediğiniz tcno yu giriniz :");
            String tcno=scan.next();

            for (int i = 0; i < ogretmenList.size(); i++) {

                if(ogretmenList.get(i).getTcNo().equals(tcno)){

                    ogretmenList.remove(i);
                    ogretmenMeu();

            }

            }




        }

    }

    @Override
    public void cikis() {

        AnaMenu anaMenu=new AnaMenu();
        anaMenu.anaMenu();

    }
}
