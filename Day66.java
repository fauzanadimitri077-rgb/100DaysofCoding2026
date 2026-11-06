import java.util.Scanner;

public class day66 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int angka = input.nextInt();

        for(int i = 1; i <= angka; i++){
            System.out.print("* ");
        }
    }
}
