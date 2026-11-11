import java.util.Scanner;

public class day71 {
    public static void main(String[] args) {
        Scanner fel = new Scanner(System.in);
        System.out.println("Masukkan nilai a");
        int a = fel.nextInt();
        for (int i = 1; i <= a; i++){
            for (int j = i; j <= a; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
