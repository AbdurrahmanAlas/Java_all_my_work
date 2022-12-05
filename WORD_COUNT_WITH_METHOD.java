import java.util.Scanner;

public class WORD_COUNT_WITH_METHOD {

    //Kullanıcının girdiği cümlede kullanıcının seçtiği harften kaç tane olduğunu bul

    /* VARİABLE
    1-Kullanıcı tarafından girilen cümle
    2-sayac
    3-charAt(i) ==>cümledeki harflerin adeti
     */

    static  void  harfBul(String sentence,char letter)
    {
        int sayac=0;
        for (int i = 0; i <sentence.length() ; i++) {

            if(sentence.charAt(i)==letter)
            {
                sayac++;
            }
        }
        System.out.println("Girdiğiniz cümlede veye kelimede" +sayac + "harf vardır");


    }

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cümle veye kelime giriniz :");
        String sentence=scan.nextLine();
        System.out.println("Bir harf giriniz :");
        char letter=scan.next().charAt(0);

        harfBul(sentence,letter);

    }


}
