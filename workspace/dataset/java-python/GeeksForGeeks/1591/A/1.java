

// Efficient Java program to find first 
// natural number whose factorial divides x. 
class GFG { 
  
    // GCD function to compute the greatest 
    // divisor among a and b 
    static int gcd(int a, int b) 
    { 
        if ((a % b) == 0) 
            return b; 
        return gcd(b, a % b); 
    } 
  
    // Returns first number whose factorial 
    // divides x. 
    static int firstFactorialDivisibleNumber(int x) 
    { 
        int i = 1; // Result 
        int new_x = x; 
  
        for (i = 1; i < x; i++) { 
  
            // Remove common factors 
            new_x /= gcd(i, new_x); 
  
            // We found first i. 
            if (new_x == 1) 
                break; 
        } 
        return i; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int x = 16; 
        System.out.print(firstFactorialDivisibleNumber(x)); 
    } 
} 
// This code is contributed by Anant Agarwal. 

