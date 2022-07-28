

// Simple Java Program to find sum of largest 
// divisible powers of P in [L, R] 
  
class GFG  
{ 
    // Utility Function 
    static int sumOfDivisblePowers(int L, int R, int P)  
    { 
        // Traverse through all numbers from L to R 
        int res = 0; 
        for (int i = L; i <= R; i++) 
        { 
            // If P divides current number x, add  
            // largest power of P that divides x. 
            int x = i; 
            while (x % P == 0) 
            { 
                res++; 
                x /= P; 
            } 
        } 
          
        return res; 
    } 
  
    // Driver code 
    public static void main (String[] args)  
    { 
        int L = 1, R = 10, P = 2; 
        System.out.println(sumOfDivisblePowers(L, R, P)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

