package OOPTamamı.OOP_My_Studies.oopGiris;

public class cokBoyutluArray {

    public static void main(String[] args) {

        int[][] arr={{10,28,43},{45,65,33}};


        System.out.println("0 a 0 " +arr[0][0]);
        System.out.println("1 a 1 " +arr[1][1]);
        System.out.println("0 a 0 " +arr[1][2]);


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Eleman : "+arr[i][j]);

            }
        }




    }
}
