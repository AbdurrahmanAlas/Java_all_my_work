package OOPTamamı.OOP_My_Studies.oopGiris.INHERITANCE;

public class Employee {


    // 1- ÖZELLİKLER YAZILIR
    private  String name;
    private  String departman;
    private  int salary;

    //2- Getter Setter methodları yazılır

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


//  3- CONSTRUCTOR YAZILIR....

    public Employee(String name, String departman, int salary) {
        this.name = name;
        this.departman = departman;
        this.salary = salary;
    }


    // 4- FONKSİYON YAZIYORUZ

    public  void showInfos(){

        System.out.println("Bilgiler....");
        System.out.println("Isım : "+this.name);
        System.out.println("maas : "+this.salary);
        System.out.println("departman : "+this.departman);
    }


}
