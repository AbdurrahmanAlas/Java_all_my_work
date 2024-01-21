package OOPTamamı.OOP_My_Studies;

public class fonksiyonParametreli {

    public  static void selamlama(String isim){

        System.out.println("Naber" +isim);
    }

    public  static void toplama(int a,int b,int c)
    {

        System.out.println("toplamları : " +(a+b+c));

    }



    public static void main(String[] args) {

        selamlama("alas");
        selamlama("al");
        toplama(3,6,7);


    }
}
