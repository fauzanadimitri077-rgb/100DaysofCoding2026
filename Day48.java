
import java.util.Scanner;

public class day48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double angka1, angka2;
        int pilihan;

        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();

        System.out.println("\n=== MENU KALKULATOR ===");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        System.out.print("Pilih operasi (1-4): ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Hasil: " + (angka1 + angka2));
                break;

            case 2:
                System.out.println("Hasil: " + (angka1 - angka2));
                break;

            case 3:
                System.out.println("Hasil: " + (angka1 * angka2));
                break;

            case 4:
                if (angka2 != 0) {
                    System.out.println("Hasil: " + (angka1 / angka2));
                } else {
                    System.out.println("Tidak bisa dibagi dengan nol!");
                }
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
    }
