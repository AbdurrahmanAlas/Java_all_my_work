package oopGiris.Encaps_Inheritance;

public class BenzinliOtomobil extends Otomobil{

    private  int yakitDurumu;
    private  String motorluakutipi;

    public BenzinliOtomobil(int yakitDurumu, String akuTipi) {
        this.yakitDurumu = yakitDurumu;
        this.motorluakutipi = akuTipi;
    }

    public  BenzinliOtomobil(int yakitDurumu){

        super("sarı", "normal","audi",4,6);

        this.yakitDurumu=yakitDurumu;
    }

    public BenzinliOtomobil(String renk, String cant, String model, int en, int boy, int yakitDurumu, String akuTipi) {
        super(renk, cant, model, en, boy);
        this.yakitDurumu = yakitDurumu;
        this.motorluakutipi = akuTipi;
    }

    public int getYakitDurumu() {
        return yakitDurumu;
    }

    public void setYakitDurumu(int yakitDurumu) {
        this.yakitDurumu = yakitDurumu;
    }

    public String getMotorluakutipi() {
        return motorluakutipi;
    }

    public void setMotorluakutipi(String motorluakutipi) {
        this.motorluakutipi = motorluakutipi;
    }

    public void depoyuDoldur(){
        this.yakitDurumu=100;
    }

}
