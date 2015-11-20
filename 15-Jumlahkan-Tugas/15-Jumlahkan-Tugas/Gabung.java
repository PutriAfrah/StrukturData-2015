public class Gabung
{
   private double[] data;
   private Kelompok[] kelompok = new Kelompok[5];

   
   public Gabung(double[] data) {
       
      for(int i=0; i<5; i++){
          int awal = i*(data.length/5);
          int akhir = awal+(data.length/5)-1;
          kelompok[i]= new Kelompok (awal, akhir, data);
        }
        
        Thread th1 = new Thread(kelompok [0]);
        Thread th2 = new Thread(kelompok [1]);
        Thread th3 = new Thread(kelompok [2]);
        Thread th4 = new Thread(kelompok [3]);
        Thread th5 = new Thread(kelompok [4]);
       
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
       
       
       
    }
   public double hasil (){
       double hasil =0;
       try {
           Thread.sleep(1000);
        }
        
        catch(InterruptedException e){}
        
       for (int i=0; i<5; i++){
           hasil = hasil + kelompok[i].hasil();
    }
    return hasil;
}

   
}
