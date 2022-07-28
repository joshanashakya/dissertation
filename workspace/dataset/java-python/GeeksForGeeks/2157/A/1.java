

// Program to check if the 
// Given number is 
// an Achilles Number 
  
class GFG { 
  
    // function to check if the number 
    // is powerful number 
    static boolean isPowerful(int n) 
    { 
        // First divide the number repeatedly by 2 
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
  
        // if n is not a power of 2 then this loop 
        // will execute repeat above process 
        for (int factor = 3; factor <= Math.sqrt(n); 
                                      factor += 2) { 
  
            // Find highest power of "factor"  
            // that divides n 
            int power = 0; 
            while (n % factor == 0) { 
                n = n / factor; 
                power++; 
            } 
  
            // If only factor^1 divides n (not higher 
            // powers), then return false 
            if (power == 1) 
                return false; 
        } 
  
        // n must be 1 now if it is not a prime number. 
        // Since prime numbers are not powerful, we  
        // return false if n is not 1. 
        return (n == 1); 
    } 
  
    // Utility function to check if 
    // number is a perfect power or not 
    static boolean isPower(int a) 
    { 
        if (a == 1) 
            return true; 
  
        for (int i = 2; i * i <= a; i++) { 
            double val = Math.log(a) / Math.log(i); 
            if ((val - (int)val) < 0.00000001) 
                return true; 
        } 
  
        return false; 
    } 
  
    // Function to check Achilles Number 
    static boolean isAchillesNumber(int n) 
    { 
        if (isPowerful(n) && !isPower(n)) 
            return true; 
        else
            return false; 
    } 
  
    // Driver Program 
    public static void main(String[] args) 
    { 
        int n = 72; 
        if (isAchillesNumber(n)) 
            System.out.println("YES"); 
        else
            System.out.println("NO"); 
  
        n = 36; 
        if (isAchillesNumber(n)) 
            System.out.println("YES"); 
        else
            System.out.println("NO"); 
    } 
} 

