import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Utama {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            Chat tanya = new Chat();
            System.out.println("Masukkan pesan:");
            String pesanmasuk = in.next();
            tanya.whois(pesanmasuk);
        }
        catch (UnknownHostException ex) {
            System.err.println(ex);
        }
        catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
