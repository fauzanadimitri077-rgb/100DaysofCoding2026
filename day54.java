import java.util.Scanner;

public class day54 {
    public static void main(String[] args) {
        Scanner fel = new Scanner(System.in);
        System.out.println("Masukkan x");
        int x = fel.nextInt();
        System.out.println("Masukkan y");
        int y = fel.nextInt();
        System.out.println("Masukkan z");
        int z = fel.nextInt();

        if (y>x){
            x+=1;
            if (z>x){
                x+=2;
            }
        } else if (y<x){
            x-=1;
            if(z<x){
                x-=2;
            }
        }
    }
    
}
