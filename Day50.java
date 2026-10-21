import java.util.Scanner;

public class day50 {
    public static void main(String[] args) {
        Scanner fel = new Scanner(System.in);
        int angka = fel.nextInt();

        String hasil = (angka % 2 == 0)? "Genap" : "Ganjil";
        System.out.println(hasil);

    }
}
