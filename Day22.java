public class day22 {
public static void main(String[] args) {
    
int A = 5;
int B = 3;

System.out.println("sebelum di tukar");
System.out.println("A = " + A);
System.out.println("B = " + B);

int f = A;
 A = B;
 B = f;

System.out.println("setelah ditukar");
System.out.println("A = " + A);
System.out.println("B = " + B);
}

}
