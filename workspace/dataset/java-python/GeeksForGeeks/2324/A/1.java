

// Java program to find the first k digits of n^n 
public class Digits 
{ 
    // function that manually calculates n^n and then 
    // removes digits until k digits remain 
    static long firstkdigits(int n, int k) 
    { 
        long product = 1; 
        for (int i = 0 ; i < n ; i++) 
           product *= n; 
      
       // loop will terminate when there are only 
        // k digits left 
       while ((int)(product / Math.pow(10, k)) != 0) 
            product = product / 10; 
        return product; 
    } 
      
    public static void main(String[] args) 
    { 
      int n = 15; 
      int k = 4; 
      System.out.println(firstkdigits(n, k)); 
    } 
} 
  
//This code is contributed by Saket Kumar 

