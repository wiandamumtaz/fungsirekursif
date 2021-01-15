package fungsirekursif;
import java.util.Scanner;
public class FungsiRekursif {

    public static void main(String[] args) {
        //Mulai
        //input
        Scanner Masukan = new Scanner(System.in);
        int bil,hasil;
        System.out.print("Masukkan suatu bilangan :");
        bil = Masukan.nextInt();
        hasil = faktorial(bil);
        System.out.println("Nilai Faktorial "+bil+" adalah: "+hasil);
    }
    private static int faktorial(int a){
        if(a==1)
            return 1;
        else 
            return (a*faktorial(a-1));
    }
    
}