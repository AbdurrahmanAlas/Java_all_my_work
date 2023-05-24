package method_olusturma;

import java.util.Scanner;

public class MethodOlusturma {

    ///////////////////PARAMETRESİZ NETHODLAR//////////////////////////////
    public static void Selamlama(){

        System.out.println("java burada");
        System.out.println("java ya hosgeldin");


    }

    public static void faktoriyel(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi=scanner.nextInt();
        int faktoriyel=1;
        while (sayi>0){
            faktoriyel*=sayi;
            sayi--;
        }

        System.out.println("faktöriyel"+faktoriyel);
    }


    ////////////////////PARAMETRELİ METHODLAR//////////////////////////////////

    public static void  selamlama2(String isim){


        System.out.println("Naber"+isim);
    }


    public static void toplama(int a,int b,int c){

        System.out.println("toplamları :"+(a+b+c));





    }



  // public Response  getRequestAdminwithBody(String fullPath, Object requestBody, String token) {
  //     response = given()
  //             .contentType(ContentType.JSON)    // request i JSON  a dönderir
  //             .headers("Authorization", "Bearer " + token)  //authorizationu ve tokenı bearer olarak belirtti projede
  //             .spec(HooksAPI.spec) // specte URL bulunuyor onu getirir
  //             .body(requestBody)  // body icinde request olusur
  //             .when()
  //             .get(fullPath); // get te fullpath i getiririz.
  //     return response;

    public static void main(String[] args) {

        //methodlar veya fonskisyonlar belli bir işi yapan ve istedigin kadar kullanılan

        //public herkes tarafından ulasılabilir

        //fonksiyonu cagırıyoruz
        Selamlama();
        Selamlama();
        Selamlama();
        Selamlama();


        faktoriyel();



        selamlama2("Abdurrahman");
        selamlama2("Alas");


        toplama(3,5,6);
        toplama(8,8,8);
    }







}
