/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrogramanaplikasimobile;

import java.util.Scanner;
/**
 *
 * @author THECOM KRAKSAAN
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlah;
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan jumlah =");
        jumlah = in.nextInt();
        
        for(int i=1; i<=jumlah; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            
            }
            System.out.println();
        }
        
    }
}
