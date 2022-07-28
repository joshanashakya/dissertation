

// Java implementation of the above approach  
import java.util.*; 
  
class GFG  
{ 
  
    static boolean[] isPrime = new boolean[(int) (1e5) + 5]; 
  
    // Function to return the reverse  
    // of a number  
    static int reverse(int n) 
    { 
        int temp = n; 
        int sum = 0; 
        while (temp > 0) 
        { 
            int rem = temp % 10; 
            sum = sum * 10 + rem; 
            temp /= 10; 
        } 
        return sum; 
    } 
  
    // Function to generate mirror reflection  
    // of a number  
    static int mirror(int n)  
    { 
        int temp = n; 
        int sum = 0; 
        while (temp > 0) 
        { 
            int rem = temp % 10; 
            if (rem == 2)  
            { 
                rem = 5; 
            }  
              
            else if (rem == 5)  
            { 
                rem = 2; 
            } 
            sum = sum * 10 + rem; 
            temp /= 10; 
        } 
        return sum; 
    } 
  
    // Function to initialize 
    // prime number sieve  
    static void sieve()  
    { 
        Arrays.fill(isPrime, true); 
  
        isPrime[0] = isPrime[1] = false; 
  
        for (int i = 2;  
                 i <= (int) 1e5; i++) 
        { 
            for (int j = 2;  
                     i * j <= (int) 1e5; j++) 
            { 
                isPrime[i * j] = false; 
            } 
        } 
    } 
  
    // Function that returns true if n is  
    // Dihedral Prime number  
    static boolean isDihedralPrime(int n)  
    { 
          
        // Check if the orientations of n  
        // is also prime  
        if (!isPrime[n] ||  
            !isPrime[mirror(n)] ||  
            !isPrime[reverse(n)] ||  
            !isPrime[reverse(mirror(n))]) 
        { 
            return false; 
        } 
  
        int temp = n; 
  
        while (temp > 0) 
        { 
            int rem = temp % 10; 
            if (rem == 3 || rem == 4 ||  
                rem == 6 || rem == 7 ||  
                rem == 9)  
            { 
                return false; 
            } 
            temp /= 10; 
        } 
  
        return true; 
    } 
  
    // Driver code  
    public static void main(String[] args) 
    { 
        sieve(); 
  
        int n = 18181; 
        if (isDihedralPrime(n)) 
        { 
            System.out.println("Yes"); 
        } 
        else 
        { 
            System.out.println("No"); 
        } 
    } 
} 
  
// This code is contributed by Rajput-Ji 

