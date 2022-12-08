package oopGiris.Polymorphism;

public class Main {

    //POLYMORPHİSM BURADA YAPTIK.
    public static void hayvaniKonustur(Hayvan hayvan) {

        hayvan.sesCikar();
        hayvan.sesCikar();
    }

    //POLYMORPHİSM OLMASAYDI BÖYLE OLURDU.

    public static void hayvaniKonustur2(Object object){

        if(object instanceof Kedi){

            Kedi kedi= (Kedi) object; //casting bu (Kedi)
            kedi.sesCikar();
        } else if ( object instanceof Kopek) {
            Kopek kopek= (Kopek) object;
        }


    }





    public static void main(String[] args) {


        Hayvan hayvan1 = new Hayvan("hayvan");
        Kedi kedi1 = new Kedi("boncuk");
        Kus kus1 = new Kus("Tweetty");
        Kopek kopek1 = new Kopek("KArabas");


        hayvaniKonustur(kedi1);
        hayvaniKonustur(kus1);
        hayvaniKonustur(kopek1);


  /*
        hayvan1.sesCikar();
        kedi1.sesCikar();
        kus1.sesCikar();
        kopek1.sesCikar();
*/

    }
}
