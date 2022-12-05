package OOP_TAMAMI.oopGiris;

import java.util.Scanner;

public class array_ortalama {

    public  static  void  mean(int[] arr){
        int total=0;
        for (int i = 0; i < arr.length; i++) {

            total+=arr[i];
        }
        System.out.println("Ortalama :" +total/arr.length);

    }


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int [] arr2=new int[5];
        System.out.println("Arrayin degerlerinin girin ");
        for (int i = 0; i < arr2.length; i++) {

            arr2[i]=scan.nextInt();
        }
        mean(arr2);
    }
}
