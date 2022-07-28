

// Java implementation of the approach 
class GFG  
{ 
    static final int maxSize = (int)1e5 + 1;  
    static boolean isPrime[] = new boolean[maxSize];  
    static int prefix[] = new int[maxSize];  
      
    // Function to return the  
    // digit sum of num  
    static int digitSum(int num)  
    {  
        int s = 0;  
        while (num != 0) 
        {  
            s = s + num % 10;  
            num = num / 10;  
        }  
        return s;  
    }  
      
    // Sieve Function to generate  
    // all primes opto maxSize  
    static void sieveOfEratosthenes()  
    {  
        for (int i = 2; i < maxSize; i++)  
        {  
            isPrime[i] = true;  
        }  
      
        for (int i = 2; i * i <= maxSize; i++) 
        {  
            if (isPrime[i])  
            {  
                for (int j = i * i;  
                         j < maxSize; j += i)  
                {  
                    isPrime[j] = false;  
                }  
            }  
        }  
    }  
      
    // Pre-Computation till maxSize  
    // and for a given K  
    static void precompute(int k)  
    {  
        sieveOfEratosthenes();  
          
        for (int i = 1; i < maxSize; i++)  
        {  
              
            // Getting Digit Sum  
            int sum = digitSum(i);  
              
            // Check if the digit sum  
            // is prime and divisible by k  
            if (isPrime[sum] == true &&  
                        sum % k == 0) 
            {  
                prefix[i]++;  
            }  
        }  
      
        // Taking Prefix Sum  
        for (int i = 1; i < maxSize; i++)  
        {  
            prefix[i] = prefix[i] +  
                        prefix[i - 1];  
        }  
    }  
      
    // Function to perform the queries  
    static void performQueries(int k, int q, 
                               int query[][])  
    {  
        // Precompute the results  
        precompute(k);  
          
        for (int i = 0; i < q; i++)  
        {  
            int l = query[i][0], r = query[i][1];  
      
            // Getting count of range in range [L, R]  
            int cnt = prefix[r] - prefix[l - 1];  
              
            System.out.println(cnt);  
        }  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int query[][] = { { 1, 11 },  
                          { 5, 15 },  
                          { 2, 24 } };  
        int k = 2, q = query.length;  
        performQueries(k, q, query);  
    }  
} 
  
// This Code is contributed by AnkitRai01 

