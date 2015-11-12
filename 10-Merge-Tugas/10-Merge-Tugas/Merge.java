import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Merge{

    public void merge(String file1, String file2, String file3, String sasaran) throws IOException {
        FileInputStream file_ke1 = null;
        FileInputStream file_ke2 = null;
        FileInputStream file_ke3 = null;
        FileOutputStream keluaran= null;
        int karakter;
    
        try {  
            // Object stream untuk masukkan
            file_ke1 = new FileInputStream(file1);
            file_ke2 = new FileInputStream(file2);
            file_ke3 = new FileInputStream(file3);
            keluaran = new FileOutputStream(sasaran);
            
            karakter = file_ke1.read();
           
            while (karakter != -1) {
                // Lakukan sesuatu dengan data yang dibaca => Tampikan
                keluaran.write(karakter);
                // Coba baca lagi dari stream
                karakter = file_ke1.read();
            }
            
            karakter = file_ke2.read();
            while (karakter != -1) {
                // Lakukan sesuatu dengan data yang dibaca => Tampikan
                keluaran.write(karakter);
                // Coba baca lagi dari stream
                karakter = file_ke2.read();
            }
            
            karakter = file_ke3.read();
            while (karakter != -1) {
                // Lakukan sesuatu dengan data yang dibaca => Tampikan
                keluaran.write(karakter);
                // Coba baca lagi dari stream
                karakter = file_ke3.read();
            }
            
            keluaran.flush();
        } 
        finally {
            // Tutup stream masukan
            if (file1 != null)           
                file_ke1.close();
            if (file2 != null)           
                file_ke2.close();
            if (file3 != null)           
                file_ke3.close();
            if (keluaran != null)
                keluaran.close();

        }
    }
    
}
