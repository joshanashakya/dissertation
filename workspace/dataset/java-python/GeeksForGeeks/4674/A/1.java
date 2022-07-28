

// JAVA program to check 
// Chen Prime number 
  
class GFG { 
    // Utility function to check 
    // if the given number is semi-prime or not 
    static boolean isSemiPrime(int num) 
    { 
        int cnt = 0; 
  
        for (int i = 2; cnt < 2 && i * i <= num; ++i) 
  
            while (num % i == 0) { 
                num /= i; 
  
                // Increment count 
                // of prime numbers 
                ++cnt; 
            } 
  
        // If number is greater than 1, 
        // add it to the count variable 
        // as it indicates the number 
        // remain is prime number 
        if (num > 1) 
            ++cnt; 
  
        // Return '1' if count is equal 
        // to '2' else return '0' 
        return cnt == 2 ? true : false; 
    } 
  
    // Function to check if a number is prime or not 
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
  
        for (int i = 5; i * i <= n; i = i + 6) { 
            if (n % i == 0 || n % (i + 2) == 0) { 
                return false; 
            } 
        } 
        return true; 
    } 
  
    // Function to check chen prime number 
    static boolean isChenPrime(int n) 
    { 
  
        if (isPrime(n) && (isSemiPrime(n + 2) || isPrime(n + 2))) 
            return true; 
        else
            return false; 
    } 
    // Driver code 
    public static void main(String[] args) 
    { 
  
        int n = 7; 
  
        if (isChenPrime(n)) 
            System.out.println("YES"); 
        else
            System.out.println("NO"); 
    } 
} 

