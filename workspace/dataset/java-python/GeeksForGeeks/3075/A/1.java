

// Java program to implement multiplicative order 
import java.io.*; 
  
class GFG { 
  
    // function for GCD 
    static int GCD(int a, int b) { 
          
        if (b == 0) 
            return a; 
              
        return GCD(b, a % b); 
    } 
      
    // Function return smallest +ve integer that 
    // holds condition A^k(mod N ) = 1 
    static int multiplicativeOrder(int A, int N) { 
          
        if (GCD(A, N) != 1) 
            return -1; 
      
        // result store power of A that rised to 
        // the power N-1 
        int result = 1; 
      
        int K = 1; 
          
        while (K < N) { 
              
            // modular arithmetic 
            result = (result * A) % N; 
          
            // return samllest +ve integer 
            if (result == 1) 
                return K; 
          
            // increment power 
            K++; 
        } 
      
        return -1; 
    } 
      
    // driver program to test above function 
    public static void main(String args[]) { 
          
        int A = 4, N = 7; 
          
        System.out.println(multiplicativeOrder(A, N)); 
    } 
} 
  
/* This code is contributed by Nikita Tiwari.*/

