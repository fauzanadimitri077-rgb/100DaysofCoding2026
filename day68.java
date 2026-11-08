import java.util.Scanner;

public class day68 {
    public static void main(String[] args) {
        Scanner fel = new Scanner(System.in);
        System.out.println("Masukkan nilai n");
        int n = fel.nextInt();
        System.out.println("Masukkan nilai m");
        int m = fel.nextInt();

        for (int i = 1; i <= n; i++){
            if (i % 2 == 1){
                continue;
            }else if (i % 2 == 0){
                System.out.println("angka genap : " + i);
                if (i % m == 0){
                    System.out.println("Target kelipatan temukan!");
                    break;

                }
            }
        }

    }
    
}
