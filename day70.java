import java.util.Scanner;

public class iday70 {
    public static void main(String[] args) {
        Scanner fel = new Scanner(System.in);
        int a = fel.nextInt();
        for (int i = 1; i <= a; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
