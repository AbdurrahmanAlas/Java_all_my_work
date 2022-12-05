public class METHOD_OVERLOADING_EXAMPLE {

    public static void main(String[] args) {

        topla(4,5);
        topla(4,2,6);
        topla(2,5,6,7);


    }

    static  void topla(int a,int b){
        System.out.println("2 sayının toplamı : " +(a+b));

    }
    static  void  topla(int a,int b,int c){

        System.out.println("3 sayının toplamı : "+(a+b+c));
    }
    static  void topla(int a,int b,int c,int d){

        System.out.println("4 sayının toplamı :" +(a+b+c+d));
    }
}
