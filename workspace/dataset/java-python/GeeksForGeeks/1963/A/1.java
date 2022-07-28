

// Java Code to Print all numbers upto  
// n bits with no consecutive set bits. 
import java.util.*; 
  
class GFG 
{ 
    static void printNonConsecutive(int n) 
        { 
            // Let us first compute  
            // 2 raised to power n. 
            int p = (1 << n); 
  
            // loop 1 to n to check  
            // all the numbers 
            for (int i = 1; i < p; i++) 
  
            // A number i doesn't contain 
            // consecutive set bits if 
            // bitwise and of i and left 
            // shifted i do't contain a 
            // commons set bit. 
            if ((i & (i << 1)) == 0) 
                System.out.print(i + " "); 
          
        } 
  
// Driver code 
public static void main(String[] args) 
    { 
        int n = 3; 
        printNonConsecutive(n); 
    } 
} 
  
// This code is contributed by Mr. Somesh Awasthi 

