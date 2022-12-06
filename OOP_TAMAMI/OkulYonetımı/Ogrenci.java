package OOP_TAMAMI.OkulYonetımı;

public class Ogrenci extends Kisi {

    private String sınif;
    private int ogrNo;

    @Override
    public String toString() {
        return super.toString() +
                "sınif='" + sınif + '\'' +
                ", ogrNo=" + ogrNo +
                '}';
    }

    public Ogrenci() {


    }

    public Ogrenci(String sınif, int ogrNo) {
        this.sınif = sınif;
        this.ogrNo = ogrNo;
    }

    public Ogrenci(String name, String surname, String tcNo, int age, String sınıf, int ogrNo) {

        //EXTENDS EDİLEN CLASSTAKİ ÖZELLİKLERİ GETİRİR.
        super(name, surname, tcNo, age);
        this.sınif = sınıf;
        this.ogrNo = ogrNo;
    }

    public String getSınıf() {
        return sınif;
    }

    public void setSınıf(String sınıf) {
        this.sınif = sınıf;
    }

    public int getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(int ogrNo) {
        this.ogrNo = ogrNo;
    }
}
