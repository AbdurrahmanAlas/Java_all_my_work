package oopGiris.Encaps_Inheritance;

public class ElektrikliOtomobiil extends Otomobil{


    private  int sarjDurumu;

    public int getSarjDurumu() {
        return sarjDurumu;
    }

    public void setSarjDurumu(int sarjDurumu) {
        this.sarjDurumu = sarjDurumu;
    }

    public  void sarjEt(){


        this.sarjDurumu=100;

    }

}
