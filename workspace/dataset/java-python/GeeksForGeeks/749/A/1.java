

//Java implementation of the above approach  
  
class GFG { 
  
    static final int MAX = 100000000; 
  
    // stores whether a number is prime or not  
    static boolean prime[] = new boolean[MAX + 1]; 
  
    // create the sieve of eratosthenes  
    static void SieveOfEratosthenes() { 
        // Create a boolean array "prime[0..n]" and initialize  
        // all entries it as true. A value in prime[i] will  
        // finally be false if i is Not a prime, else true.  
        for (int i = 0; i < prime.length; i++) { 
            prime[i] = true; 
        } 
        prime[1] = false; 
  
        for (int p = 2; p * p <= MAX; p++) { 
  
            // If prime[p] is not changed, then it is a prime  
            if (prime[p] == true) { 
  
                // Update all multiples of p as non-prime  
                for (int i = p * 2; i <= MAX; i += p) { 
                    prime[i] = false; 
                } 
            } 
        } 
    } 
  
    // find the two prime numbers with minimum  
    // difference and whose sum is equal to  
    // variable sum  
    static void find_Prime(int sum) { 
  
        // start from sum/2 such that  
        // difference between i and sum-i will be  
        // minimum  
        for (int i = sum / 2; i > 1; i--) { 
  
            // if both 'i' and 'sum - i' are prime then print  
            // them and break the loop  
            if (prime[i] && prime[sum - i]) { 
                System.out.println(i + " " + (sum - i)); 
                return; 
            } 
        } 
        // if there is no prime  
        System.out.println("Cannot be represented as sum of two primes"); 
    } 
    public static void main(String []args) { 
        // create the sieve  
        SieveOfEratosthenes(); 
        int sum = 1002; 
        // find the primes  
        find_Prime(sum); 
    } 
} 
/*This code is contributed by 29AjayKumar*/

