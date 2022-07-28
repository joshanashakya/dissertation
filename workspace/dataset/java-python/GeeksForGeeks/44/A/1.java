

// Java implementation of the approach 
class GFG 
{ 
    static final int MAX=1000000; 
      
    // stores whether the number is prime or not 
    static boolean []prime=new boolean[MAX + 1]; 
      
    // stores the count of prime numbers 
    // less than or equal to the index 
    static int []sum=new int[MAX + 1]; 
      
    // create the sieve 
    static void SieveOfEratosthenes() 
    { 
        // Create a boolean array "prime[0..n]" and initialize 
        // all the entries as true. A value in prime[i] will 
        // finally be false if 'i' is Not a prime, else true. 
        for(int i=0;i<=MAX;i++) 
            prime[i]=true; 
              
         for(int i=0;i<=MAX;i++) 
            sum[i]=0; 
          
        prime[1] = false; 
      
        for (int p = 2; p * p <= MAX; p++) { 
      
            // If prime[p] is not changed, then it is a prime 
            if (prime[p]) { 
      
                // Update all multiples of p 
                for (int i = p * 2; i <= MAX; i += p) 
                    prime[i] = false; 
            } 
        } 
      
        // stores the prefix sum of number 
        // of primes less than or equal to 'i' 
        for (int i = 1; i <= MAX; i++) { 
            if (prime[i] == true) 
                sum[i] = 1; 
      
            sum[i] += sum[i - 1]; 
        } 
    } 
      
    // Driver code 
    public static void main(String []args) 
    { 
        // create the sieve 
        SieveOfEratosthenes(); 
      
        // 'l' and 'r' are the lower and upper bounds 
        // of the range 
        int l = 3, r = 9; 
      
        // get the value of count 
        int c = (sum[r] - sum[l - 1]); 
      
        // display the count 
        System.out.println("Count: " + c);  
      
    } 
  
} 

