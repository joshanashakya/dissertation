

// Efficient CPP Program to find sum of  
// largest divisible powers of P in [L, R] 
  
class GFG  
{ 
    // Implements Lagrange's theorem  
    // (Finds largest power of P that 
    // divides x! 
    static int largestPower(int x, int P) 
    {  
        // Calculate x/p + x/(p^2) + x/(p^3) + .... 
        int res = 0; 
        while(x != 0) 
        { 
            x /= P; 
            res += x; 
        } 
        return res; 
    } 
  
    // Returns sum of largest powers  
    // of P that divide numbers in  
    // range from L to R. 
    static int sumOfDivisblePowers(int L, int R, int P)  
    { 
        return largestPower(R, P) - largestPower(L-1, P); 
    } 
  
    // Driver code 
    public static void main (String[] args) 
    { 
        int L = 1, R = 10, P = 2; 
        System.out.println(sumOfDivisblePowers(L, R, P)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

