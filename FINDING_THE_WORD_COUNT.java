import java.util.Scanner;

public class FINDING_THE_WORD_COUNT {

    public static void main(String[] args) {

        //Kullanıcıdan alınan cümlede kaç tane kelime olduğunu bulan program

        /*Variables
        1-KULLANICIDAN GİRİLEN CÜMLE
        2-SAYAC
        3-charAt(i) ==>cümledeki harfleri verir sayar
        4-sentence.length() ==> cümlenin karakter sayısını döndürür

         */



        Scanner scan= new Scanner(System.in);
        int sayac=1;

        System.out.println("Cümle giriniz :");
        String sentence=scan.nextLine();

        for (int i = 0; i < sentence.length(); i++) {

            if(sentence.charAt(i)==' '){

                sayac++;
            }

        }
        System.out.println("Girilen cümlede " + sayac +" tane word vardır");





    }
}
