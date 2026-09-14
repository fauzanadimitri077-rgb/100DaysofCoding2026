soal 1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nama :");
      String nama = input.nextLine();
      System.out.print("masukkan tahun lahir :");
      int tahunLahir = input.nextInt();
      System.out.print("masuskan tahun sekarang :");
      int tahunSekarang = input.nextInt();

      int umur = tahunSekarang - tahunLahir ;

      System.out.println("Nama :" + nama);
      System.out.println("Umur :" + umur +" tahun");
    }
}

soal 2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

      System.out.print(" nama barang :");
      String barang = input.nextLine();
      System.out.print("harga barang :");
      int harga = input.nextInt();
      System.out.print("jumlah barang :");
      int jumlah  = input.nextInt();

      int total = harga * jumlah ;

      System.out.println("Barang :"+ barang);
      System.out.println("Harga : RP"+ harga);
      System.out.println("Jumlah :"+ jumlah );
      System.out.println("Total : RP"+ total);

    }
}

soal 3
  import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
      
      System.out.print("masukkan panjang :");
      int panjang = input.nextInt();
      System.out.print("masukkan lebar :");
      int lebar = input.nextInt();
      
      int luas = panjang * lebar ;

      System.out.println("Luas :"+ luas);
    }
}
