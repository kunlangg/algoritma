/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversinilai;

import java.util.Scanner;

/**
 *
 * @author Lab Aplikasi
 */
public class Percabangann {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukan Angka =");
        int angka = masukan.nextInt();
        if (angka%2==0) {
            if (angka>10) {
                System.out.println("Bilangan Genap dan"); 
            }
                System.out.println("BIlangan Genap");
        }   else {
            System.out.println("Bilangan Ganjil");
        }
                
        String hasil = angka%2==0? "Bilangan Genap":"Bilangan Ganjil";
        System.out.println(hasil);
                 
    }
    
} 