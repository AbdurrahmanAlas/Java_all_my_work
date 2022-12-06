package OOP_TAMAMI.OkulYonetımı;

public class Kisi {

    /* 1- özellikleri yazıyoruz
    *  2- Getter Setter methodlarını yazıyoruz Encapsulation
    *  3- Constructor oluştururuz.
    *  4- toString() methodu yazarız.
    * */


    private  String name;
    private  String surname;
    private  String tcNo;
    private  int age;

    public Kisi() {


    }

    public Kisi(String name, String surname, String tcNo, int age) {
        this.name = name;
        this.surname = surname;
        this.tcNo = tcNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
