import java.util.Scanner;

public class day74 {
    public static void main(String[] args) {
        Scanner fel = new Scanner(System.in);
        System.out.println("masukkan nama anda : ");
        String nama = fel.nextLine();

        // untuk menghitung karakter dalam string 
        System.out.println(nama.length());
        // membuat semua karakter menjadi huruf kapital !
        System.out.println(nama.toUpperCase());
        // membuat semua huruf kapital menjadi huruf kecil 
        System.out.println(nama.toLowerCase());
    }
    
}
