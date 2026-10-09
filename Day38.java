import java.util.Scanner;

public class day38 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("=== BIODATA DIRI ===");
            System.out.println("Nama: Fauzan Adi Mitri");
            System.out.println("Jurusan: Informatika");
        }

        if (pilihan == 2) {
            System.out.println("Alamat : Malunda");
          System.out.println("Tanggal lahir : 16-12-2007");
        }

        if (pilihan == 3) {
            System.out.println("Status : Imo 800 bintang");
        }

        if (pilihan < 1 || pilihan > 3) {
            System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}
