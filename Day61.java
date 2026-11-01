import java.util.Scanner;

public class day61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int hasil = 1;

        System.out.print("Masukkan angka N: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            hasil = hasil * i;
        }

        System.out.println("Hasil perkalian: " + hasil);
    }
}
