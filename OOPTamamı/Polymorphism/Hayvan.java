package OOPTamamı.Polymorphism;

public class Hayvan {
    private String adi;

    public Hayvan(String adi) {
        this.adi = adi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public void sesCikar(){
        System.out.println(this.adi +"ses cikariyor");
    }


}
