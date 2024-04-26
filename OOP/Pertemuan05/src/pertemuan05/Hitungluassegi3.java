package pertemuan05;

/**
 *
 * @author Juni Antari
 * tgl : 2024-04-26
 */
public class Hitungluassegi3 {
    double Alas, Tinggi, Luas;
    
    void SetAlas (double Nilai){
        Alas = Nilai;
    }
    void SetTinggi (double Nilai){
        Tinggi = Nilai;
        
    }
    double GetAlas(){
        return Alas;
        
    }
    double GetTinggi(){
        return Tinggi;
        
    }
    double HitungLSegi3 (){
        double hsl = (Alas*Tinggi) / 2;
        
        return hsl;
    }
    void TampilHasil(){
        System.out.println("Hitung Luas Segi Tiga");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nilai Alas : "+Alas);
        System.out.println("Nilai Tinggi : "+Tinggi);
        System.out.println("Nilai Luas : ");
        System.out.println(" Luas = Alas*Tinggi/2");
        System.out.println("             ="+Alas+"*"+Tinggi+"/2");
        System.out.println("             ="+Luas);
        
        
    }
}
