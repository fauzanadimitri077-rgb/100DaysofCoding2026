import java.util.Scanner;

public class day64 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int angka, hasil = 1;

        System.out.print("Masukkan angka: ");
        angka = input.nextInt();

        for(int i = 1; i <= angka; i++) {
            hasil = hasil * i;
        }

        System.out.println("Hasil faktorial: " + hasil);
    }
          }
