/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawan;

/**
 *
 * @author Moch Lutfi
 */
public class Karyawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int gaji = 2000000;
        
        if (gaji>=2000000)
        {
            System.out.println("anda karyawan biasa");
        }
        if (gaji<=1500000)
        {
            System.out.println("anda karyawan pembersih");
        }
        else{
            System.out.println("anda BOs");
        }
    }
    
}
