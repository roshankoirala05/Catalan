/**
   Main method to test the methods of the Catalan class.  
   The method displays the value returned by each method, as well as the elapsed time in nanoseconds.
*/ 
public class CatalanTest  
{
   public static void main(String[] args) 
   {
      long startTime, endTime, result;
      for (int n = 2; n < 20; n = n * 2) 
      {
         startTime = System.nanoTime();
         result = Catalan.rec1(n);
         endTime = System.nanoTime();
         System.out.printf("Computing C(%d) using rec1 returns %12d after %12d nanoseconds\n", 
                           n, result, endTime - startTime);
         startTime = System.nanoTime();
         result = Catalan.rec2(n);
         endTime = System.nanoTime();
         System.out.printf("Computing C(%d) using rec2 returns %12d after %12d nanoseconds\n", 
                           n, result, endTime - startTime);
         startTime = System.nanoTime();
         result = Catalan.dpr1(n);
         endTime = System.nanoTime();
         System.out.printf("Computing C(%d) using dpr1 returns %12d after %12d nanoseconds\n", 
                           n, result, endTime - startTime);
         startTime = System.nanoTime();
         result = Catalan.dpr2(n);
         endTime = System.nanoTime();
         System.out.printf("Computing C(%d) using dpr2 returns %12d after %12d nanoseconds\n\n", 
                           n, result, endTime - startTime);
      }
   }
}