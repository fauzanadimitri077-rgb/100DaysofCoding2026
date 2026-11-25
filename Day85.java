
public class day85 {
    public static void main(String[] args) {

        int[] angka = {20, 15, 8, 25, 12};

        int minimal = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] < minimal) {
                minimal = angka[i];
            }
        }

        System.out.println("Angka terkecil adalah: " + minimal);
    }
}
