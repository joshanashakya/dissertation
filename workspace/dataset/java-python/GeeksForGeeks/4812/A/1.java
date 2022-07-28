

// Java program to find the  
// required permutation 
// of first 2*N natural numbers 
class GFG  
{  
          
    // Function to find the required permutation 
    // of first 2*N natural numbers 
    static void printPermutation(int n, int k)  
    {  
        // Iterate in blocks of 2 
        for (int i = 1; i <= n; i++)  
        { 
            int x = 2 * i - 1; 
            int y = 2 * i; 
          
        // We need more increments, 
        // so print in reverse order 
        if (i <= k) 
            System.out.print(y + " " + x + " "); 
  
        // We have enough increments,  
        // so print in same order 
        else
            System.out.print(x + " " + y + " "); 
        } 
    }  
          
    // Driver code  
    public static void main(String []args)  
    {  
        int n = 2, k = 1; 
        printPermutation(n, k); 
    }  
} 
  
// This code is contributed by Ita_c. 
  

