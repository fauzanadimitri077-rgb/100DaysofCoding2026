import java.util.Scanner;
public class day36{
  public static void main(String [ ] args){
  Scanner fel = new Scanner(System.in);
    int angka = fel.nextInt();
    if (angka % 2== 0){
    System.out.println("genap");
    } else {
      System.out.println("ganjil");
    }
  }
}
