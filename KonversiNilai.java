/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author Lab Aplikasi
 */
public class KonversiNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     String nim, nama, prodi, matkul;
         int nilai;
         Scanner masukan = new Scanner (System.in);
         System.out.println("Masukan NIM : ");
         nim = masukan.nextLine();
         System.out.println("Masukan Nama : ");
         nama = masukan.nextLine();
         System.out.println("Matkul : ");
         matkul = masukan.nextLine();
         System.out.println("Masukan nilai angka : ");
         nilai = masukan.nextInt();
         
         prodi = nim.substring(3, 5);
            if (nilai >= 100 ) {
                System.out.println("Tidak ada! \n");
            }

            switch (prodi) {
            case "52":
                System.out.println("S1 - Teknologi Informasi");
                break;
            case "51":
                System.out.println("S1 - Sistem Informasi");
                break;
            case "31":
                System.out.println("D3 - Sistem Informasi");
                break;
            default:
                System.out.println("Program Studi Tidak Ditemukan");
                break;
        }
  if (nilai >= 85 && nilai < 100) {
                System.out.println("A");
  }
  else if (nilai >= 80 && nilai < 84) {
                System.out.println("A-");
  }
  else if (nilai >= 75 && nilai < 79) {
                System.out.println("B+");
  }
  else if (nilai >= 70 && nilai < 74) {
                System.out.println("B");
  }
  else if (nilai >= 65 && nilai < 69){
                System.out.println("B-");
  }
  else if (nilai >= 60 && nilai < 64) {
                System.out.println("C+");
  }
  else if (nilai >= 55 && nilai < 59) {
                System.out.println("C");
  }
  else if (nilai >= 50 && nilai <54) {
                System.out.println("C-");
  }
  else if (nilai >= 45 && nilai <49) {
                System.out.println("D");
  }
  else if (nilai >= 0 && nilai <44) {
                System.out.println("E");
  }
  
  
  else {
                System.out.println("Maaf, format nilai tidak sesuai \n");
  }
  
  }
  }