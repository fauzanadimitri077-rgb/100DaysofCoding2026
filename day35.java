public class day35 {
    public static void main(String[] args) {

        int umur = 18;
        boolean punyaKartu = true;

        if (umur >= 17) {

            if (punyaKartu) {
                System.out.println("Boleh masuk.");
            } else {
                System.out.println("Umur cukup, tetapi tidak punya kartu.");
            }

        } else {
            System.out.println("Umur belum cukup.");
        }
    }
}
