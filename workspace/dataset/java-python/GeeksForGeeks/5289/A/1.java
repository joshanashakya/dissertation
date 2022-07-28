

// Java program to verify Nicomachu's Theorem 
import java.io.*; 
  
class GFG { 
  
    static void NicomachuTheorum_sum(int n) 
    { 
          
        // Compute sum of cubes 
        int sum = 0; 
          
        for (int k = 1; k <= n; k++) 
            sum += k * k * k; 
              
        // Check if sum is equal to 
        // given formula. 
        int triNo = n * (n + 1) / 2; 
          
        if (sum == triNo * triNo) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
      
    // driver function 
    public static void main (String[] args) 
    { 
        int n = 5; 
        NicomachuTheorum_sum(n); 
    } 
} 
  
// This code is contributed by anuj_67. 

