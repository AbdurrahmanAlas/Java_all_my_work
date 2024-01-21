package OOPTamamı.Encaps_Inheritance;

public class Main {

    public static void main(String[] args) {

        Otomobil otomobil1=new Otomobil("Kırmızı","celik","bmw",34,56);

        System.out.println(otomobil1.getRenk()+" " +otomobil1.getModel());

        Otomobil otomobil2=new Otomobil("SArı","normal","mercedes",2,3);

        System.out.println(otomobil2.getRenk()+" " +otomobil2.getModel());

        Otomobil otomobil3=new Otomobil();
        System.out.println(otomobil3.getRenk()+ " " +otomobil3.getCant());

        BenzinliOtomobil benzinliOtomobil=new BenzinliOtomobil("SArı","normal","mazda",2,3,50,"25");
        System.out.println(benzinliOtomobil.getCant()+" " +benzinliOtomobil.getCant());

        BenzinliOtomobil benzinliOtomobil2=new BenzinliOtomobil(3);
        System.out.println(benzinliOtomobil2.getYakitDurumu());

    }
}
