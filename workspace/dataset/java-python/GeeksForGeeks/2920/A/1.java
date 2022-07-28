

// Java program to find sum of given 
// series. 
  
public class FINDSUM { 
      
    static long mod = 1000000007; 
      
    public static long findSum(long n) 
    { 
        return ((n % mod) * (n % mod)) % mod;    
    } 
      
    public static void main(String[] args) { 
        long n = 229137999;     
        System.out.print (findSum(n)); 
    } 
} 
  
// Contributed by _omg 

