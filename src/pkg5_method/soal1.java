
package pkg5_method;


//librari untuk menginpor scanner untuk melakukan sebuah inputan
import java.util.Scanner;

public class soal1 {
    
    //fungsi dengan looping
    static void banyak( int angka){
            for(int i = 0; i < angka; i++){
                System.out.println("saya senang bahasa java");
            }
        }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //deklarasi
        int angka;
        
        //input angka
        System.out.println("masukan angka");
        angka = scanner.nextInt();
        
        //pemanggilan fungsi
        banyak(angka);
 
    }
    
}
