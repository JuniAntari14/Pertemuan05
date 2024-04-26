package latihan05;

/**
 *
 * @author Lab E
 */
public class Latihan05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        
        // Mengatur nilai nim dan nama menggunakan metode set
        mahasiswa.setNim("2201010172");
        mahasiswa.setNama("Juni Antari");
        
        // Mendapatkan nilai nim dan nama menggunakan metode get dan mencetaknya
        System.out.println("NIM : " + mahasiswa.getNim());
        System.out.println("NAMA : " + mahasiswa.getNama());
    }
    }
    

