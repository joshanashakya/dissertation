

// Java program to check if given number is strong prime 
class GFG { 
  
    // Utility function to check 
    // if a number is prime or not 
    static boolean isPrime(int n) 
    { 
        // Corner cases 
        if (n <= 1) 
            return false; 
        if (n <= 3) 
            return true; 
  
        // This is checked so that we can skip 
        // middle five numbers in below loop 
        if (n % 2 == 0 || n % 3 == 0) 
            return false; 
  
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false; 
  
        return true; 
    } 
  
    // Function that returns true if n is a strong prime 
    static boolean isStrongPrime(int n) 
    { 
        // If n is not a prime number or 
        // n is the first prime then return false 
        if (!isPrime(n) || n == 2) 
            return false; 
  
        // Initialize previous_prime to n - 1 
        // and next_prime to n + 1 
        int previous_prime = n - 1; 
        int next_prime = n + 1; 
  
        // Find next prime number 
        while (!isPrime(next_prime)) 
            next_prime++; 
  
        // Find previous prime number 
        while (!isPrime(previous_prime)) 
            previous_prime--; 
  
        // Arithmetic mean 
        int mean = (previous_prime + next_prime) / 2; 
  
        // If n is a strong prime 
        if (n > mean) 
            return true; 
        else
            return false; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
  
        int n = 11; 
  
        if (isStrongPrime(n)) 
            System.out.println("Yes"); 
  
        else
            System.out.println("No"); 
    } 
} 

