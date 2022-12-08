package oopGiris.Polymorphism;

public class Kopek extends Hayvan {


    public Kopek(String adi) {
        super(adi);
    }



    public  void seCikar(){

        System.out.println(super.getAdi() + " havliyor");
    }
}
