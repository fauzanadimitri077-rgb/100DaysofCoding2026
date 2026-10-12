import java.util.Scanner;

public class day41 {
    public static void main(String[] args) throws Exception {
        Scanner fel = new Scanner(System.in);
        System.out.println("Masukkan suhu ruangan : ");
        double suhu = fel.nextDouble();

        if (suhu < 16 ){
            System.out.println("Sangat Dingin");
        } else if (suhu <= 20 ){
            System.out.println("Dingin");
        } else {
            System.out.println("PANASSSSSSSSSS");
        }
    }
}
