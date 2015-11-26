public class prima
{   
   //  int prima [] = new int[1000000];

    /**
     * Constructor for objects of class prime
     */
   public prima()
   {   int angka = 10000;
       
       for(int j=1;j<angka;j++){
       int periksa=0;
       for(int i=2;i<j;i++){
         if((j%i)==0){
           periksa=1;
           break;
         }
       }
       
       if (periksa==0){
           System.out.println(j);
       }
      }
   }
}