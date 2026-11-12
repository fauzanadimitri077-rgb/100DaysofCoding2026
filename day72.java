import java.util.Scanner;

public class day72 {
    public static void main(String[] args) {
        Scanner fel = new Scanner(System.in);
        System.out.print("Masukkan nilai a : ");
        int a = fel.nextInt();
        
        int total = 0;
        for (int i = 1; i <= a; i++){
            System.out.println(i);
            if (a < 0){
                break;
            }
            total += a;
        }
        System.out.println(total);
    }
    
}
