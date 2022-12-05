package OOP_TAMAMI.oopGiris;

import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {

        ArrayList<String> groups=new ArrayList<>();
        groups.add("ahmet");
        groups.add("alas");
        groups.add("harun");
        groups.add("kemal");

        groups.remove("alas");

        for (int i = 0; i < groups.size(); i++) {
            System.out.println("Eleman :" +groups.get(i));

        }


        System.out.println("O.index: " +groups.get(0));
        System.out.println("1.index: " +groups.get(1));
        System.out.println("2.index: " +groups.get(2));
        System.out.println("uzunluk" +groups.size());





    }
}
