package OOPTamamı.Polymorphism;

public class Kedi extends Hayvan{

    public Kedi(String adi) {
        super(adi);
    }

    public void sesCikar(){

        System.out.println(super.getAdi()+"miyavliyor");
    }
}
