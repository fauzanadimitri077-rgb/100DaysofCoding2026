public class Main {
    public static void main(String[] args) {

        int[] angka = {10, 20, 30, 40, 50};
        int cari = 30;
        boolean ditemukan = false;

        for (int i = 0; i < angka.length; i++) {

            if (angka[i] == cari) {
                ditemukan = true;
                System.out.println("Angka ditemukan di indeks ke-" + i);
                break;
            }
        }

        if (ditemukan == false) {
            System.out.println("Angka tidak ditemukan");
        }
    }
}
