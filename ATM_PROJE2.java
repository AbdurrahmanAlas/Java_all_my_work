import java.util.Scanner;

public class ATM_PROJE2 {


    public static void main(String[] args) {

        /**Java döngüler ile kullanıcının banka hesabını yönetebildiği bir ATM projesi yapınız.
         */

        /* Kullanıcın Adı olmalı username,
           Kullanıcının sifresi olmalı password,
           Kullanıcının bakiyesi olmalı  balance
           Kullanıcının giris hakkı olmalı  giris_hakkı=3;      ŞARTIMIZ
           Kullanıcı hangi menuye girecek select yapabilmeli     ŞARTIMIZ


        */
        String username;
        String password;
        int balance=5000;
        int girishakkı=3;
        int select;

        Scanner input=new Scanner(System.in);
        while (girishakkı>0){

            System.out.println("Enter from username");
            username=input.nextLine();

            System.out.println("Enter from password");
            password=input.nextLine();

            if(username.equals("Abdurrahman")&&password.equals("1234")){

            do{
                System.out.println("1- Para yatırma \n" +
                        "2-Para çekme \n"+
                        "3-Bakiye Sorgula \n"+
                        "4-Cıkış yap");
                System.out.println("Yapmak istediğiniz işlemi giriniz");
                select=input.nextInt();


                if(select==1){


                    System.out.print("Para miktarı : ");
                    int paramiktarı=input.nextInt();
                    balance=balance+paramiktarı;



                } else if (select==2) {

                    System.out.println("Para Miktarı :");
                    int paramiktarı=input.nextInt();

                    if(paramiktarı>balance){
                        System.out.println("Bakiyeniz yetersiz");
                    }else {

                        balance=balance-paramiktarı;                    }


                } else if (select==3) {

                    System.out.println("Para miktarınız :" +balance);
                }


            }while (girishakkı!=4);

            System.out.println("Tekrar görüşmek üzere");
            break;




        }
        else {

            girishakkı--;

                System.out.println("Hatalı kullanıcı adı veya şifre tekrar deneyiniz !!");
            if(girishakkı==0){

                System.out.println("Hesabınız bloke olmuştur");
            }else {

                System.out.println("Kalan hakkınız" +girishakkı);
            }



            }

    }





    }
}
