public class day55 {
    static int tambah(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        
        System.out.println("CONTOH CONTINUE");

        for (int i = 1 ; 1 <= 5 ; i++){
            if (i == 3){
                continue;
            }
            System.out.println(i);
        }
          System.out.println("\n===CONTOH BREAK===");
          for (int i = 1; i <= 5 ; i++ ){
            if (i  ==4 ){
              break;  
            }
            System.out.println(i);
          }
       System.out.println("CONTOH RETURN");
       
       int hasil  = tambah (10 , 5);
       System.out.println("Hasil penjumlahan : "+ hasil );
    }
}

