package latihan05;

/**
 *
 * @author Juni Antari 
 * NIM : 2201010172
 */
public class Mahasiswa {
    private String nim;
    private String nama;

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("2201010172");
        mahasiswa.setNama("Juni Antari");

        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("NAMA: " + mahasiswa.getNama());
    }
}

