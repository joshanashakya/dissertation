

// Java Code to check if an integer 
// can be expressed as sum of 
// two semi-primes 
  
import java.util.*; 
  
class GFG { 
  
    static final int MAX = 1000000; 
    static Vector<Integer> arr = new Vector<>(); 
    static boolean[] sprime = new boolean[MAX]; 
  
    // Utility function to compute 
    // semi-primes in a range 
    static void computeSemiPrime() 
    { 
  
        for (int i = 0; i < MAX; i++) 
            sprime[i] = false; 
  
        for (int i = 2; i < MAX; i++) { 
  
            int cnt = 0; 
            int num = i; 
            for (int j = 2; cnt < 2 && j * j <= num; ++j) { 
                while (num % j == 0) { 
                    num /= j; 
                    ++cnt; 
                    // Increment count 
                    // of prime numbers 
                } 
            } 
  
            // If number is greater than 1, add it to 
            // the count variable as it indicates the 
            // number remain is prime number 
  
            if (num > 1) 
                ++cnt; 
  
            // if count is equal to '2' then 
            // number is semi-prime 
  
            if (cnt == 2) { 
  
                sprime[i] = true; 
                arr.add(i); 
            } 
        } 
    } 
  
    // Utility function to check 
    // if a number is sum of two 
    // semi-primes 
    static boolean checkSemiPrime(int n) 
    { 
        int i = 0; 
  
        while (arr.get(i) <= n / 2) { 
  
            // arr[i] is already a semi-prime 
            // if n-arr[i] is also a semi-prime 
            // then  a number can be expressed as 
            // sum of two semi-primes 
  
            if (sprime[n - arr.get(i)]) { 
                return true; 
            } 
  
            i++; 
        } 
  
        return false; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        computeSemiPrime(); 
  
        int n = 30; 
        if (checkSemiPrime(n)) 
            System.out.println("YES"); 
        else
            System.out.println("NO"); 
    } 
} 

