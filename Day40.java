import java.util.Scanner;

public class day40 {
    public static void main (String [ ] args){
        Scanner fel = new Scanner(System.in);
        System.out.println("Masukkan huruf");
        char huruf = fel.next().toUpperCase().charAt(0);
        int kode = (int) huruf;
        System.out.println("kode : "+ kode );
        if ( kode % 2 == 0){
            System.out.println("genap");
        }else {
            System.out.println("genap");
        }
        fel.close();
    }
}

