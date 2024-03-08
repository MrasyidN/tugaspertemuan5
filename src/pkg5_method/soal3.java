
package pkg5_method;

import java.util.Scanner;

public class soal3 {
    
    //fungsi
    static int pembagi(int a, int b){
        int pbt = 0;
        while (b != 0){
        pbt = b;
        b = a % b;
        a = pbt;
    }
        //mengembalikan nilai
        return pbt;
}
    
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        //input bilangan a
        System.out.println("masukan bilangan a");
        int a = scanner.nextInt();
        
        //input bilangan b
        System.out.println("masukan bilangan b");
        int b = scanner.nextInt();
        
        //pemanggilan method
        System.out.println("hasil dari pembagi bersama terbesar yaitu :" +pembagi(a, b) );
    }
    
}
