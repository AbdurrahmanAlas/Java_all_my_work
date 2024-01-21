package OOPTamamı.OOP_My_Studies.oopGiris.INHERITANCE;

public class Main {
    public static void main(String[] args) {

        Employee employee=new Employee("Abdurrahman Alas","Bilişim",3000);
        employee.showInfos();

        Manager manager=new Manager("Abdurrahman","Bilişim",3939,10);
        manager.showInfos();


        System.out.println(manager);




        manager.raiseSalary(100);

    }
}
