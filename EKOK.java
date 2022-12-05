import java.util.Scanner;

public class EKOK {

    public static void main(String[] args) {


        int sayi1;
        int sayi2;
        int kucukSayi;
        int buyukSayi;

        Scanner scan=new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz : ");
        sayi1=scan.nextInt();
        System.out.println("İkinci sayıyı giriniz :");
        sayi2=scan.nextInt();

        if(sayi1>sayi2){

            kucukSayi=sayi2;
            buyukSayi=sayi1;

        }
        else {

            kucukSayi=sayi1;
            buyukSayi=sayi2;

        }

        for (int i = kucukSayi; i >=1 ; i--) {

            if(sayi1%i==0 && sayi2%i==0){
                System.out.println("EBOB :" +i);
                break;
            }
        }

        for (int i = buyukSayi; i <sayi1*sayi2 ; i++) {

            System.out.println("EKOK" +i);
            break;
            
        }



    }
}
