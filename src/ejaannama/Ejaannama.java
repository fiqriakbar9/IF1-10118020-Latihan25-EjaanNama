/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejaannama;

import java.util.Scanner;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menampilkan hasil
 * ejaan dari nama yang sudah di inputkan
 */
public class Ejaannama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        int i = 1;
        int j = 1;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("Masukkan Nnama depan anda untuk di eja : ");
        nama = scan.next();
        
        //Memecah huruf 
        String[] panjangnama = nama.split("");
        
        //menampilkan huruf
        System.out.println("");
        System.out.println("Ejaan untuk "+"'"+nama+"'"+" Adalah : " );
        while (i < panjangnama.length){
            System.out.println("Huruf ke-" +j+ " : "+panjangnama[i]);
            j = i + 1;
            i++;
        }
         System.out.println ("\nDevelop by : Fiqri Akbar Pratama");
    }
    
}
