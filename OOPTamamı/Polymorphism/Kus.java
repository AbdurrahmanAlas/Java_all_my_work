package OOPTamamı.Polymorphism;

public class Kus extends Hayvan{
    public Kus(String adi) {
        super(adi);
    }

    @Override
    public void sesCikar() {
        System.out.println(super.getAdi()+ "otuyor");
    }
}
