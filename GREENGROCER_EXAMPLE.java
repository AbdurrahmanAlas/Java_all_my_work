import java.util.Scanner;

public class GREENGROCER_EXAMPLE {
    public static void main(String[] args) {

//Proje Konusu
//#Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
//
//Ürün Kg Fiyatları
//
//Salatalık : 3,14 TL
//Elma : 4,11 TL
//Kabak : 2,22 TL
//Domates: 0,95 TL
//Patlıcan : 7,00 TL

        Scanner scan=new Scanner(System.in);

        double cucumber=3.14;
        double apple=4.45;
        double orange=3.67;
        double  bananas=4.56;
        double patlıcan=5.78;

        System.out.println("hov many kilos of cucumber :");
        double cucumberkilos=scan.nextDouble();

        System.out.println("how many kilos of apple :");
        double appleKilos=scan.nextDouble();

        System.out.println("how many kilos of orange");
        double orangeKilos=scan.nextDouble();

        System.out.println("how many kilos of bananas");
        double bananasKilos=scan.nextDouble();

        System.out.println("how many kilos of patlıcan");
        double patlıcanKilos=scan.nextDouble();

        double total=(cucumber*cucumberkilos)+(apple*appleKilos)+(orange*orangeKilos);







    }
}
