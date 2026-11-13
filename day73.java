import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
        Scanner fel = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("=== PILIH MENU ===");
            System.out.println("1. Nasi goreng");
            System.out.println("2. Bakso");
            System.out.println("3. Ayam goreng");
            System.out.println("4. keluar");
            // dari nano
            System.out.println("Pilih nomor menu");
            pilih = fel.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Nasi goreng sedang di proses");
                    break;
                case 2 :
                     System.out.println("Bakso sedang di proses");
                    break;
                case 3 :
                     System.out.println("Ayam goreng sedang di proses");
                     break;
                case 4:
                     System.out.println("Program selesai");
                     break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilih != 4);

        }
    }
    

