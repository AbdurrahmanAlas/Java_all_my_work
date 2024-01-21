package OOPTamamı.Encaps_Inheritance;

public class Otomobil {

    private   String renk;
    private   String cant;

    public Otomobil() {

        this.renk="bordo";
        this.cant="normal";
    }

    public Otomobil(String renk, String cant, String model, int en, int boy) {
        this.renk = renk;
        this.cant = cant;
        this.model = model;
        this.en = en;
        this.boy = boy;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getCant() {
        return cant;
    }

    public void setCant(String cant) {
        this.cant = cant;
    }

    private  String model="Audi";
    private int en=2;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    private  int boy=3;

    //HEr bir classın kendine ait methodları bulunur.



}
