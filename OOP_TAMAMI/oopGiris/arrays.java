package OOP_TAMAMI.oopGiris;

import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int[] arr2=new int[5];

        System.out.println("Array2 nin degerlerini girin...");
        for (int i = 0;  i<arr2.length ; i++) {
            arr2[i]=scanner.nextInt();
        }

        System.out.println("Array2 nin degerleri yazılıyor.");


        for (int i = 0; i <arr2.length ; i++) {

            System.out.println("Eleman : "+arr2[i]);
        }

        for(int i:arr2 ){

            System.out.println("Eleman :" +i);
        }


























        //2.yol
        /*
        int [] arr2=new int[5];
        arr2[0]=1;
        arr2[1]=4;
        arr2[2]=9;
        arr2[3]=8;

        System.out.println("array2 nin birinci elamanı :"+arr2[0]);
        System.out.println("array2 nin birinci elamanı :"+arr2[1]);
  */

    }
}
