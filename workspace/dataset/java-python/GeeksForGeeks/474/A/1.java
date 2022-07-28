

// Java program to count 
// all those numbers in 
// given range whose count 
// of prime factors  
// is k 
  
import java.io.*; 
import java.util.*; 
  
class GFG { 
      
    static void printKPFNums(int A, int B, int K) 
    { 
        // Count prime factors of all numbers 
        // till B. 
        boolean prime[] = new boolean[B+1]; 
        Arrays.fill(prime,true); 
        int p_factors[] = new int[B+1]; 
        Arrays.fill(p_factors,0); 
  
        for (int p = 2; p <= B; p++)  
            if (p_factors[p] == 0)  
                for (int i = p; i <= B; i += p)  
                    p_factors[i]++; 
       
        // Print all numbers with k prime factors 
        for (int i = A; i <= B; i++)  
            if (p_factors[i] == K) 
                System.out.print( i + " "); 
    } 
       
    // Driver code 
    public static void main(String args[]) 
    { 
        int A = 14, B = 18, K = 2; 
        printKPFNums(A, B, K); 
    } 
} 
  
  
// This code is contributed 
// by Nikita Tiwari. 

