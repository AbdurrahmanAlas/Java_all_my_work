package OOPTamamı.OOP_My_Studies;

public class method_overloading {


    public  static  void toplama(int a,int b,int c){

        System.out.println("Toplamları :" +(a+b+c));
    }

    public  static  void toplama(int a,int b){

        System.out.println("Toplamları : "+(a+b));
    }

    public  static void  skorHesapla(String name,int score){


        System.out.println(name + "isimli oyuncu puanı" +score);

    }

    public static void main(String[] args) {

        toplama(4,5,6);
        toplama(4,5);
        skorHesapla("Abdurrahman",40303);

    }
}
