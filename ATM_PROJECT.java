import java.sql.SQLOutput;
import java.util.Scanner;

public class ATM_PROJECT {

    public static void main(String[] args) {

        /**Java döngüler ile kullanıcının banka hesabını yönetebildiği bir ATM projesi yapınız.
         */

        // 1- KULLANICININ KULLANICI ADI OLMALI        username
        // 2- KULLANICININ ŞİFRESİ OLMALI              password
        // 3- KULLANICININ SİSTEME GİRİŞ HAKKI OLMALI  girishakkı
        //4- KULLANICININ BAKİYESİ OLMALI              balance
        //5-  KULLANICI HANGİ MENUYE GİDECEĞİNE SEÇİM YAPABİLMELİ    select

        String username;
        String password;
        int girishakki=3;
        int balance=3430;
        int select;;


        //  1- öncelikle Scanner sınıfını oluşturalım

        Scanner input=new Scanner(System.in);
        while (girishakki>0){


            System.out.println("Enter from username :");
            username=input.nextLine();

            System.out.println("Enter from password :");
            password=input.nextLine();

            if(username.equals("Abdurrahman")&&password.equals("1234")){

                System.out.println("Bankamıza hoşgeldiniz");

            do {
                System.out.println("1- Para yatırma \n" +
                                   "2-Para çekme \n"+
                                    "3-Bakiye Sorgula \n"+
                                    "4-Cıkış yap");

                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz :");
                select=input.nextInt();


                if(select==1){

                    System.out.println("Para miktarı :");
                    int fiyat=input.nextInt();
                    balance=balance+fiyat;

                } else if(select==2){

                    System.out.println("Para miktarı :");
                    int fiyat=input.nextInt();
                    if(fiyat>balance){

                        System.out.println("Bakiye yetersiz");
                    } else {
                        balance=balance-fiyat;
                    }



                } else if (select==3) {

                    System.out.println("Bakiyeniz :" +balance);

                }


            } while (select != 4);


                System.out.println("Tekrar görüşmek üzere");
                break;





            }

            else {

                girishakki--;
                System.out.println("Hatalı kullanıcı adı veya şifre tekrar deneyiniz");
                if(girishakki==0){

                    System.out.println("Hesabınız bloke olmuştur");
                } else {
                    System.out.println("Kalan hakkınız :" +girishakki);
                }
            }






        }



    }
}
