import java.util.Scanner;

public class aritmatika {
public static void main(String[] args) {
Scanner fel = new Scanner(System.in);
int a = fel.nextInt();
int b = fel.nextInt();

  a = a + b;
  b = a - b;
  a = a - b;
  System.out.println(a);
  System.out.println(b);
  
}
}
