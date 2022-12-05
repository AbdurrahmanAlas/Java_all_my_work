import java.util.Scanner;

public class TAKSİMETRE_CALCULATE {


    //#Proje Konusu
    //#Java ile gidilen kilometre verisine göre taksimetre tutarını hesaplayıp ekrana yazdıran programı yazın.
    //
    //-Taksimetre kilometre başına 2.20 TL tutmaktadır.
    //-Kısa mesafe tutarı 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    //-Taksimetre açılış ücreti 10 TL'dir.


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Km verisini giriniz :");
        double km=scan.nextInt();
        double price=10+(km*2.20);

        if(price<20){
            price=20;
        }
        System.out.println(price);



    }
}
