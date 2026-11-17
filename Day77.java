import java.util.Scanner;

public class LatihanString {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = rr.nextLine();

        System.out.print("Masukkan tempat lahir: ");
        String tempat = rr.nextLine();

        System.out.print("Masukkan hobi: ");
        String hobi = rr.nextLine();

        System.out.println("\n=== HASIL BIODATA ===");

        // 1. length()
        System.out.println("Jumlah karakter: " + nama.length());

        // 2. toUpperCase()
        System.out.println("Huruf kapital: " + nama.toUpperCase());

        // 3. toLowerCase()
        System.out.println("Huruf kecil: " + nama.toLowerCase());

        // 4. equals()
        System.out.println("Nama sama dengan Rendi: "
                + nama.equals("Rendi Revandi"));

        // 5. equalsIgnoreCase()
        System.out.println("Nama sama (abaikan huruf): "
                + nama.equalsIgnoreCase("rendi revandi"));

        // 6. contains()
        System.out.println("Mengandung kata Rendi: "
                + nama.contains("Rendi"));

        // 7. isEmpty()
        System.out.println("Nama kosong: " + nama.isEmpty());

        // 8. substring()
        if (nama.length() >= 3) {
            System.out.println("3 huruf pertama: "
                    + nama.substring(0, 3));
        }

        // 9. replace()
        System.out.println("Hobi setelah diganti: "
                + hobi.replace("game", "olahraga"));

        // 10. trim()
        System.out.println("Tempat lahir: " + tempat.trim());

        rr.close();
    }
}
