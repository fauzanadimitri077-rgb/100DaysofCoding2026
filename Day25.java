import java.util.Scanner;

public class aritmatika {
public static void main(String[] args) {
Scanner fel = new Scanner(System.in);

System.out.print("Masukkan nilai :");
int r = fel.nextInt();
double phi = 3.14;

double keliling = 2 * phi * r ;
double luas = phi * r * r ;
  System.out.println("hasil keliling :" + keliling);
  System.out.println("hasil luas :" + luas);
}
}
