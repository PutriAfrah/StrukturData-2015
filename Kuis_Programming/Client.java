import java.net.Socket;
import java.net.UnknownHostException;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;

import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.BufferedWriter;

import java.util.Scanner;

public class Client {
    public void chat() 
    throws UnknownHostException, IOException {
        Socket socket = new Socket("192.168.43.68", 33333);
        Reader masukan=null;
        BufferedReader masukanBuff=null;

        try {

            Scanner keyboard = new Scanner(System.in);
            System.out.print("Pesan: ");
            String ketikanSatuBaris = keyboard.nextLine();

            // Tulis ke socket
            Writer keluaranWriter = new OutputStreamWriter(socket.getOutputStream()); 
            BufferedWriter keluaranBuff = new BufferedWriter(keluaranWriter);
            keluaranBuff.write(ketikanSatuBaris);
            keluaranBuff.write("\n");
            keluaranBuff.flush();

            // Baca dari Server
            System.out.print("Dari server: ");
            masukan = new InputStreamReader(socket.getInputStream()); 
            masukanBuff = new BufferedReader(masukan);
            String baris = masukanBuff.readLine();
            System.out.println(baris);

            if(baris.equals("SIAPA")){
            }
            else if(baris.equals("WAKTU")){
            }

        }
        catch(IOException salah) {
            System.out.println(salah);
        }
        finally {
            if (socket != null)
                socket.close();
        }
    }
}
