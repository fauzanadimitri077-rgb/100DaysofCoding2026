import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Nama: ");
    String nama = input.nextLine();

    System.out.print("Umur : ");
    int umur = input.nextInt();

    System.out.print("Jenis kelamin : ");
    String jenisKelamin = input.nextLine();

    System.out.print("Alamat : ");
    String alamat = input.nextLine();

    System.out.print("Jurusan : ");
    String jurusan =input.nextLine();

    System.out.print("Hobi : ");
    String hobi = input.nextLine();

    System.out.println("\n=====BIODATA=====");
    System.out.println("Nama :" + nama);
    System.out.println("Umur :" + umur);
    System.out.println("Jenis kelamin :" + jenisKelamin);
    System.out.println("Alamat :" + alamat);
    System.out.println("Jurusan :" + jurusan);
    System.out.println("Hobi :" + hobi);
    System.out.println("=================");
  
	}
}
