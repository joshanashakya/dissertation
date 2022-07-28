

// A naive recursive Java program  
// to find number of non-negative 
// solutions for a given linear equation 
import java.io.*; 
  
class GFG  
{ 
          
    // Recursive function that returns  
    // count of solutions for given 
    // rhs value and coefficients coeff[start..end] 
    static int countSol(int coeff[], int start, 
                        int end, int rhs) 
    { 
        // Base case 
        if (rhs == 0) 
        return 1; 
      
        // Initialize count of solutions  
        int result = 0;  
      
        // One by subtract all smaller or 
        // equal coefficiants and recur 
        for (int i = start; i <= end; i++) 
        if (coeff[i] <= rhs) 
            result += countSol(coeff, i, end,  
                               rhs - coeff[i]); 
      
        return result; 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
        int coeff[] = {2, 2, 5}; 
        int rhs = 4; 
        int n = coeff.length; 
        System.out.println (countSol(coeff, 0,  
                                     n - 1, rhs)); 
              
    } 
} 
  
// This code is contributed by vt_m. 

