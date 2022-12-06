package OOP_TAMAMI.OkulYonetımı;

public class Ogretmen extends Kisi {


    private  String bolum;
    private int sicilNo;

    public Ogretmen(){


    }

    public Ogretmen(String bolum, int sicilNo) {
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen(String name, String surname, String tcNo, int age, String bolum, int sicilNo) {


        // BİR ÜST CLASSTAKİ EXTENDS EDİLEN CLASSTAKİ ÖZELLİKLERİ GETİRİR.
        super(name, surname, tcNo, age);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "bolum='" + bolum + '\'' +
                ", sicilNo=" + sicilNo +
                '}';
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }
}
