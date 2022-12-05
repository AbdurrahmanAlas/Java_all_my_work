import java.util.Scanner;

public class VUCUT_kITLE_INDEKSI {

    public static void main(String[] args) {

        //Proje Konusu
        //#Java ile kullanıcıdan boy ve kilo değerlerini alarak aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        //
        //Örnek Çıktı
        //Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
        //Lütfen kilonuzu giriniz : 105
        //Vücut Kitle İndeksiniz : 35.49215792320173


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz :");
        double size=scan.nextDouble();

        System.out.println("Lütfen kilonuzu kg cinsinden giriniz :");
        double weight=scan.nextDouble();

        double indeks= weight/(size*size);

        System.out.println("Vucut kitle indeksiniz :" +indeks);







    }
}
