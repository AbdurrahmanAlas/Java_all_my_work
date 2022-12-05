import java.util.Scanner;

public class KDV_HESABI {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        double price,rate=18,kdvprice,total;


        System.out.println("Tutar giriniz :");
        price=scan.nextDouble();


        kdvprice=price*(rate/100);
        total=kdvprice+price;

        System.out.println("KDV oranı : %"+(int)rate);
        System.out.println("KDV Tutarı : " +kdvprice);
        System.out.println("KDV'li Tutarı : " +total);











    }
}
