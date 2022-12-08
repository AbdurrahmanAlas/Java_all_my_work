package oopGiris.Compozition;

public class Main {

    public static void main(String[] args) {

        Motor myMotor=new Motor(344,5555);
        Pervane myPervane=new Pervane(39,555);
        Depo myDepo=new Depo(400);


        Helikopter sikorsky=new Helikopter(145,myMotor,myPervane,myDepo);

        sikorsky.getMotor().motoruCalis();
        sikorsky.getMotor().motoruKapat();

    }
}
