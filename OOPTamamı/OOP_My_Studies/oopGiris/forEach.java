package OOPTamamı.OOP_My_Studies.oopGiris;

import java.util.ArrayList;

public class forEach {
    public static void main(String[] args) {



        ArrayList<String> groups=new ArrayList<>();
        groups.add("ahmet");
        groups.add("alas");
        groups.add("harun");
        groups.add("kemal");


        for(String s:groups){


            System.out.println("Eleman :" +s);
        }



    }

}
