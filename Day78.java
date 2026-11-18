import java.util.Scanner;

public class day78 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== BUAT AKUN ===");

        System.out.print("Username: ");
        String username = input.nextLine();

        System.out.print("Password: ");
        String password = input.nextLine();

        String user, pass;

        do {
            System.out.println("\n=== LOGIN ===");

            System.out.print("Username: ");
            user = input.nextLine();

            System.out.print("Password: ");
            pass = input.nextLine();

            if (!user.equals(username) || !pass.equals(password)) {
                System.out.println("Login gagal! Coba lagi.");
            }

        } while (!user.equals(username) || !pass.equals(password));

        System.out.println("\nLogin berhasil!");
        System.out.println("Selamat datang!");

        input.close();
    }
}
