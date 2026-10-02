public class day31 {
    public static void main(String[] args) {

        int umur = 18;
        boolean punyaKartu = true;
        boolean tidakPunya = false;

        // AND (&&)
        if (umur >= 17 && punyaKartu) {
            System.out.println("Masuk aja");
        } else {
            System.out.println("Jangan masuk");
        }

        // OR (||)
        if (umur < 17 || punyaKartu) {
            System.out.println("Masuk aja ");
        } else {
            System.out.println("Jangan masuk ");
        }

        // NOT (!)
        if (tidakPunya) {
        } else {
            System.out.println("Masuk aja");
        }
    }
}
