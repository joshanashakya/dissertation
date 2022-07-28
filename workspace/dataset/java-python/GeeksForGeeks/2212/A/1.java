

// Java program to find Equidigital Numbers till n 
  
import java.util.Vector; 
import static java.lang.Math.sqrt; 
  
class GFG  
{ 
    static final int MAX = 10000; 
    static Vector<Integer> primes = new Vector<Integer>(MAX+1); 
      
    // Utility function for sieve of sundaram 
    static void sieveSundaram() 
    { 
        // In general Sieve of Sundaram, produces primes smaller 
        // than (2*x + 2) for a number given number x. Since 
        // we want primes smaller than MAX, we reduce MAX to half 
        // This array is used to separate numbers of the form 
        // i+j+2ij from others where 1 <= i <= j 
        boolean marked[] = new boolean[MAX/2 + 1]; 
       
        // Main logic of Sundaram. Mark all numbers which 
        // do not generate prime number by doing 2*i+1 
        for (int i=1; i<=(sqrt(MAX)-1)/2; i++) 
            for (int j=(i*(i+1))<<1; j<=MAX/2; j=j+2*i+1) 
                marked[j] = true; 
       
        // Since 2 is a prime number 
        primes.add(2); 
       
        // Print other primes. Remaining primes are of the 
        // form 2*i + 1 such that marked[i] is false. 
        for (int i=1; i<=MAX/2; i++) 
            if (marked[i] == false) 
                primes.add(2*i + 1); 
    } 
       
    // Returns true if n is a Equidigital number, else 
    // false. 
    static boolean isEquidigital(int n) 
    { 
        if (n == 1) 
            return true; 
       
        // Count digits in original number 
        int original_no = n; 
        int sumDigits = 0; 
        while (original_no > 0) 
        { 
            sumDigits++; 
            original_no = original_no/10; 
        } 
       
       
        // Count all digits in prime factors of n 
        // pDigit is going to hold this value. 
        int pDigit = 0 , count_exp = 0, p = 0; 
        for (int i = 0; primes.elementAt(i) <= n/2; i++) 
        { 
            // Count powers of p in n 
            while (n % primes.elementAt(i) == 0) 
            { 
                // If primes[i] is a prime factor, 
                p = primes.elementAt(i); 
                n = n/p; 
       
                // Count the power of prime factors 
                count_exp++; 
            } 
       
            // Add its digits to pDigit. 
            while (p > 0) 
            { 
                pDigit++; 
                p = p / 10; 
            } 
       
            // Add digits of power of prime factors to pDigit. 
            while (count_exp > 1) 
            { 
                pDigit++; 
                count_exp = count_exp / 10; 
            } 
        } 
       
        // If n!=1 then one prime factor still to be 
        // summed up; 
        if (n != 1) 
        { 
            while (n > 0) 
            { 
                pDigit++; 
                n = n/10; 
            } 
        } 
       
        // If digits in prime factors and 
        // digits in original number are same, then 
        // return true. Else return false. 
        return (pDigit == sumDigits); 
    } 
      
    // Driver method 
    public static void main (String[] args) 
    { 
       // Finding all prime numbers before limit. These 
       // numbers are used to find prime factors. 
       sieveSundaram(); 
       
       System.out.println("Printing first few Equidigital Numbers" + 
                           " using isEquidigital()"); 
         
       for (int i=1; i<20; i++) 
           if (isEquidigital(i)) 
               System.out.print(i + " "); 
    } 
} 

