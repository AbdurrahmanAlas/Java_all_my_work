import java.util.Scanner;

public class HIPOTENUS_CALCULATE {

    public static void main(String[] args) {

        //#Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve üçgene ait Hipotenüsü hesaplayan programı yazın.

        Scanner scan=new Scanner(System.in);
        System.out.println("1.kenarı giriniz :");
        int a=scan.nextInt();

        System.out.println("2.kenarı giriniz :");
        int b=scan.nextInt();


        double c=Math.sqrt((a*a)+(b*b));

        System.out.println("Hipotenüs :" +(int)c);

        //c*c=(a*a)+(b*b)




    }
}
