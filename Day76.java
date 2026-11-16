public class day76 {
    public static void main(String[] args) {

        String nama = "   Fauzan Adi Mitri   ";

        // Menghapus spasi
        String bersih = nama.trim();

        // Mengganti kata
        String ganti = bersih.replace("Adi", "Abdul");

        // Mengambil sebagian teks
        String potong = ganti.substring(0, 6);

        System.out.println("Nama awal   : " + nama);
        System.out.println("Setelah trim: " + bersih);
        System.out.println("Setelah ganti: " + ganti);
        System.out.println("Setelah potong: " + potong);
    }
}
