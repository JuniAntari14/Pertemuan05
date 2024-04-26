/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan05;

/**
 *
 * @author Lab E
 */
public class Pertemuan05 {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        aritmatika Amatik = new aritmatika();
        int hsltambah = 0;
        
        hsltambah = Amatik.tambah(3, 5);
        System.out.println("hasil: "+hsltambah);
        
        Hitungluassegi3 HLS3 = new Hitungluassegi3();
        HLS3.SetAlas(5);
        HLS3.SetTinggi(8);
        double hsl = HLS3.HitungLSegi3();
        HLS3.TampilHasil();
        
    }
    
}
