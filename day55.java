
import java.util.Scanner;

public class day55 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilihan = 0;

        while (true) {

            System.out.println("\n=== MENU KEYWORD JAVA ===");
            System.out.println("1. Contoh Continue");
            System.out.println("2. Contoh Break");
            System.out.println("3. Contoh Return");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.println("\nContoh Continue");

                    for (int i = 1; i <= 5; i++) {
                        if (i == 3) {
                            continue;
                        }
                        System.out.println(i);
                    }
                    break;

                case 2:
                    System.out.println("\nContoh Break");

                    for (int i = 1; i <= 5; i++) {
                        if (i == 4) {
                            break;
                        }
                        System.out.println(i);
                    }
                    break;

                case 3:
                    System.out.println("\nContoh Return");
                    System.out.println("Program dihentikan.");
                    input.close();
                    return;

                case 4:
                    System.out.println("Keluar dari program.");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
