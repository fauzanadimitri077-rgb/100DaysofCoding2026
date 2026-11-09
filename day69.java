import java.util.Scanner;

public class day67 {
  public static void main(String[] args) {
    Scanner fel = new Scanner(System.in);
    System.out.println("masukkan nilai a :");
    int a = fel.nextInt();
    int b = fel.nextInt();

    for(int i = 1; i <= a; i++){

        for(int j = 1;j <= b; j++) {
            System.out.print("* ");
        }

        System.out.println();
    }
  }  
}
