import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class KopiBerkas{
public void kopi(String sumber, String sasaran) throws IOException {
        FileInputStream masukan = null;
        FileOutputStream keluaran = null;
        // Deklarasi variabel
        try {                       
            masukan = new FileInputStream(sumber);      //nilai awal
            keluaran = new FileOutputStream(sasaran);
            
            // Coba baca  dari stream
            int karakter = masukan.read();
            // Selama masih ada data yang masih bisa dibaca
            while (karakter != -1) {            //jika selesai baca nya makan dia akan berenti (-1)
                // Lakukan sesuatu dengan data yang dibaca => Tampikan
                keluaran.write(karakter);
                // Coba baca lagi dari stream
                karakter = masukan.read();
                
            }
             keluaran.flush();   
        } 
        catch (IOException kesalahan) {
            System.out.printf("Terjadi kesalahan: %s", kesalahan);
        }
    
    
 
        finally {                       //salah gak salah blog nya akann dijalankan
            // Tutup stream masukan
            if (masukan != null)
                masukan.close();   
                if (keluaran != null)
                keluaran.close();//jika sudah selesai jgn lupa dituup
        }
    }
}
