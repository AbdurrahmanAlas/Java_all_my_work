package OOP_TAMAMI.oopGiris;

public class Main {

    public static void main(String[] args) {

        Car car1=new Car("Gümüş","Renault megane",1.6,4);

        Car car2=new Car();

        Car car3=new Car("Beyaz","Mercedes");

       car1.ShowInfos();
       car2.ShowInfos();
       car3.ShowInfos();


    }
}
