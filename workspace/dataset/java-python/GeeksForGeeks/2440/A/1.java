

// Java program to count natural numbers whose 
// factorials are divisible by x but not y. 
  
class GFG 
{ 
    // GCD function to compute the greatest 
    // divisor among a and b 
    static int gcd(int a, int b) 
    { 
        if ((a % b) == 0) 
            return b; 
        return gcd(b, a % b); 
    } 
      
    // Returns first number whose factorial 
    // is divisible by x. 
    static int firstFactorialDivisibleNumber(int x) 
    { 
        int i = 1; // Result 
        int new_x = x; 
          
        for (i = 1; i < x; i++) 
        { 
            // Remove common factors 
            new_x /= gcd(i, new_x); 
          
            // We found first i. 
            if (new_x == 1) 
                break; 
        } 
        return i; 
    } 
      
    // Count of natural numbers whose factorials 
    // are divisible by x but not y. 
    static int countFactorialXNotY(int x, int y) 
    { 
        // Return difference between first natural 
        // number whose factorial is divisible by 
        // y and first natural number whose factorial 
        // is divisible by x. 
        return (firstFactorialDivisibleNumber(y) - 
                firstFactorialDivisibleNumber(x)); 
    }  
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int x = 15, y = 25; 
        System.out.print(countFactorialXNotY(x, y)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

