

// Java program to find if a 
// number is powerful or not. 
  
class GFG { 
    // function to check if the 
    // number is powerful 
    static boolean isPowerful(int n) 
    { 
        // First divide the number 
        // repeatedly by 2 
        while (n % 2 == 0) { 
            int power = 0; 
            while (n % 2 == 0) { 
                n /= 2; 
                power++; 
            } 
  
            // If only 2^1 divides n (not higher powers), 
            // then return false 
            if (power == 1) 
                return false; 
        } 
  
        // if n is not a power of 2 then this loop will execute 
        // repeat above process 
        for (int factor = 3; factor <= Math.sqrt(n); factor += 2) { 
            // Find highest power of "factor" that divides n 
            int power = 0; 
            while (n % factor == 0) { 
                n = n / factor; 
                power++; 
            } 
  
            // If only factor^1 divides n (not higher powers), 
            // then return false 
            if (power == 1) 
                return false; 
        } 
  
        // n must be 1 now if it is not a prime numenr. 
        // Since prime numbers are not powerful, we return 
        // false if n is not 1. 
        return (n == 1); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        if (isPowerful(20)) 
            System.out.print("YES\n"); 
        else
            System.out.print("NO\n"); 
        if (isPowerful(27)) 
            System.out.print("YES\n"); 
        else
            System.out.print("NO\n"); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

