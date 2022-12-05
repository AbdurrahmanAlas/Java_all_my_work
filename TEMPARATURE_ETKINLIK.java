import java.util.Scanner;

public class TEMPARATURE_ETKINLIK {
    public static void main(String[] args) {

       /*#Java ile kullanıcının girdiği sıcaklık durumuna göre aşağıda ki etkinlikleri öneren programı yazınız.

                - Sıcaklık 5'den küçük ise "Kayak" yapmayı öner.
                - Sıcaklık 5 ve 15 arasında ise "Tiyatro" etkinliğini öner.
        - Sıcaklık 15 ve 25 arasında ise "Mangal" etkinliğini öner.
        - Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
*/


        Scanner scan=new Scanner(System.in);
        System.out.println("Derece :");
        int temparature=scan.nextInt();

        if(temparature<5) {
            System.out.println("Kayak");
        }else if(temparature>5&& temparature<15){
            System.out.println("Tiyatro");
        } else if (temparature>=15&&temparature<25) {

            System.out.println("Mangal");
        }

        else {

            System.out.println("Hadi eve");
        }
    }
}
