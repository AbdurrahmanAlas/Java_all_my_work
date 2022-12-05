package OOP_TAMAMI;

public class fonksiyonReturn {

    /*
    ofis-1  Ofis-2  Ofis-3  Ofis-4
    Elimizdeki belge

     */

    public  static  int toplama(int a,int b,int c) {

      return (a+b+c);


    }

    public  static int ucilecarp(int a){

        return a*3;
    }

    public  static  int ikitopla(int a){

        return a+2;
    }



    public static void main(String[] args) {


        System.out.println("Fonksiyondan dönen deger :" +toplama(4,6,8));

        System.out.println(ikitopla(ucilecarp(4)));

    }




}
