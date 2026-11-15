public class day75 {
    public static void main(String[] args) {

        String nama = "Fauzan";
        String nama2 = "fauzan";
        String kalimat = "Saya belajar Java";
        String kosong = "";

        // equals()
        System.out.println(nama.equals(nama2));

        // equalsIgnoreCase()
        System.out.println(nama.equalsIgnoreCase(nama2));

        // contains()
        System.out.println(kalimat.contains("Java"));

        // isEmpty()
        System.out.println(kosong.isEmpty());
    }
}
