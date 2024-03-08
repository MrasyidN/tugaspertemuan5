
package pkg5_method;


import java.util.Scanner;

public class soal2 {
    //membuat fungsi
    static int sisa(int batasAwal, int batasAkhir){
        int jumlah = 0;
        for(int i = batasAwal; i <= batasAkhir; i++){
            if(i %2 == 0){
                jumlah++;
            }
        }
        //mengembalikan nilai
        return jumlah;
    
}
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //input bilagnan awal
        System.out.println("masukan bilangan awal");
        int batasAwal = scanner.nextInt();
        
        //input bilagnan akhir
        System.out.println("masukan bilangan akhir");
        int batasAkhir = scanner.nextInt();
        
        //melakukan pemanggilan
        System.out.println("Jumlah bilangan genap : " + sisa(batasAwal, batasAkhir));
    }
    
}
