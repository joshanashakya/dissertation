

// Java program for sum of the series  
// 0.x,  0.xx, 0.xxx, ... upto k terms  
  
public class GFG { 
      
    // function which return the sum of series  
    static float sumOfSeries(int x, int k)  
    {  
       float y = (float) (((float)(x) / 81) * (9 * k - 1 + Math.pow(10, (-1) * k)));  
       return y ; 
    }  
      
    // Driver code  
    public static void main (String args[]){ 
         int x = 9;  
         int k = 20;  
         System.out.println(sumOfSeries(x, k));  
    } 
  
// This code is contributed by ANKITRAI1 
} 

