
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IantReza
 */
public class Latihan34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();

        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        kalkulator.value1 = scanner.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kalkulator.value2 = scanner.nextDouble();

        //format dua digit di belakang koma
        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("\nHasil Penjumlahan : "+kalkulator.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+kalkulator.kurangBiangan());
        System.out.println("Hasil Perkalian : "+kalkulator.kaliBilangan());
        System.out.println("Hasil Pembagian : "+df.format(kalkulator.bagiBilangan()));
        System.out.println("Hasil Sisa : "+kalkulator.sisaBilangan());
        
    }
    
}
