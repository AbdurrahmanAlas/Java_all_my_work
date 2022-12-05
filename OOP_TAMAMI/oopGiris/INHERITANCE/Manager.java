package OOP_TAMAMI.oopGiris.INHERITANCE;

public class Manager extends Employee {


    private  int sorumlu_calısan_sayısı;



    // SUPER CLASSTAN EXTENDS EDİP CONSTRUCTOCTUR GETİRİYORUZ
    public Manager(String name, String departman, int salary, int sorumlu_calısan_sayısı) {
        super(name, departman, salary);
        this.sorumlu_calısan_sayısı=sorumlu_calısan_sayısı;
    }

    @Override
    public String toString() {
        return  "manager objesi";
    }

    //METHOD YAZIYORUM
    public  void raiseSalary(int amount){

        System.out.println("Calısanlara" +amount + "tl zam yapıldı.");
    }

    @Override
    public void showInfos() {

        super.showInfos();
        System.out.println("Sorumlu kisi sayısı :" +this.sorumlu_calısan_sayısı);


    }
}

