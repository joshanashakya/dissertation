

// Java program to find n-th number 
// with sum of digits as 10. 
import java.lang.Math; 
class GFG { 
  
    public static int findNth(int n) 
    { 
        int nthElement = 19 + (n - 1) * 9; 
        int outliersCount = (int)Math.log10(nthElement) - 1; 
  
        // find the nth perfect number 
        nthElement += 9 * outliersCount; 
        return nthElement; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        System.out.println(findNth(5)); 
    } 
} 
  
// This code is contributed by 
// Code_Mech 

