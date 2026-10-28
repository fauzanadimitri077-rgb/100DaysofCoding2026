import java.util.Scanner;

public class day57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = input.nextInt();

        int i = 1;

        System.out.println("Angka Ganjil:");
        while (i <= n) {
            System.out.print(i + " ");
            i += 2;
        }

        int j = 2;

        System.out.println("\nAngka Genap:");
        while (j <= n) {
            System.out.print(j + " ");
            j += 2;
        }

        input.close();
    }
}
