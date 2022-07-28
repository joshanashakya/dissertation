

// Java implementation of the approach 
class GFG { 
  
    // Function to return the required gcd 
    static long max_gcd(long n, long p) 
    { 
        int count = 0; 
        long gcd = 1; 
  
        // Count the number of times 2 divides p 
        while (p % 2 == 0) { 
  
            // Equivalent to p = p / 2; 
            p >>= 1; 
            count++; 
        } 
  
        // If 2 divides p 
        if (count > 0) 
            gcd *= (long)Math.pow(2, count / n); 
  
        // Check all the possible numbers 
        // that can divide p 
        for (long i = 3; i <= Math.sqrt(p); i += 2) { 
            count = 0; 
            while (p % i == 0) { 
                count++; 
                p = p / i; 
            } 
            if (count > 0) { 
                gcd *= (long)Math.pow(i, count / n); 
            } 
        } 
  
        // If n in the end is a prime number 
        if (p > 2) 
            gcd *= (long)Math.pow(p, 1 / n); 
  
        // Return the required gcd 
        return gcd; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        long n = 3; 
        long p = 80; 
        System.out.println(max_gcd(n, p)); 
    } 
} 

