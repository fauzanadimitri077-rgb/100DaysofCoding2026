import java.util.Scanner;
public class day36{
  public static void main (String[ ]args){
Scanner fel = new Scanner(System.in);
int angka = fel.nextInt();

    if (angka >0) {
      System.out.println("Positif");
    } else if (angka < 0) {
      System.out.println("Negatif");
    } else {
      System.out.println("0");
    }
  }
}
  
