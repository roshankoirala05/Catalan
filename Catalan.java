/**
 * Contains four methods that computes the value of nth Catalan number
 *
 * @author Roshan Koirala  
 * @version 1.0
 * @since 03/10/2015
 */

/*
  Class that contains methods to computer the value of nth catalan number
*/
public class Catalan
{

 /*
  Computes Cn using given recursive definition 1 
  @param n The number of catalan value to be obtained
  @return The value of the nth catalan number
*/

   public static long rec1( int n)
   {
      long cn=0;
      if ( n < 1 )
         return 1;
      
      else
      {
         for( int i = 0; i < n ; i++)
            cn += rec1(i)* rec1(n -i-1);
         return cn;
      }
   }

/*
  Computes Cn using given recursive definition 2 
  @param n The number of catalan value to be obtained
  @return The value of the nth catalan number
*/

   public static long rec2( int n )
   {
      if ( n <1)
         return 1;
      
      else 
         return (rec2(n-1)*((4*n) -2))/(n+1) ;
      
   }

/*
  Computes Cn using given explicit formula 3 
  @param n The number of catalan value to be obtained
  @return The value of the nth catalan number
*/

   public static long dpr1( int n )
   {
      return  (binomialCoeff(2*n, n ))/(n+1); 
   }
   
  /*
  Computes the binomailCoefficient  
  @param n The total number of possible item
  @param k the number of combinations required
  @return the value of binomailCoefficient 
*/

   public static long binomialCoeff( int n, int k )
   {
   
      long[][] BC = new long[n+1][k+1];
   
      for( int i = 0; i <= n ; i ++)
         for ( int j = 0; j <= Math.min( i, k); j ++)
         {
            if ( j == 0 || j ==i)
               BC[i][j] = 1 ;
            else
               BC[i][j] = BC[i-1][j-1] + BC[i-1][j];
         }
      
      return BC[n][k];
   }

   /*
  Computes Cn using given recursive definition 1 using dynamic programming
  @param n The number of catalan value to be obtained
  @return The value of the nth catalan number
*/

   public static long dpr2( int n )
   {
      long[] catNum = new long[n+1];
      
      catNum[0] = 1;
      catNum[1] = 1; 
      
      if ( n >1)
         for ( int i = 2 ; i <= n ; i++)
         {
            catNum[i] = 0;
            for ( int j = 0; j <i ; j ++ ) 
               catNum[i] += catNum[j] * catNum[i-j-1];
         }
         
      return catNum[n];
   }

}