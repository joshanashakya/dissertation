

// Java implementation of the above approach  
  
public class GFG{ 
  
  
    static final int MAX = 1000001;  
      
    // primeUpto[i] denotes count of prime  
    // numbers upto i  
    static int primeUpto[] = new int [MAX];  
      
    // Function to compute all prime numbers  
    // and update primeUpto array  
    static void SieveOfEratosthenes()  
    {  
        int isPrime[] = new int[MAX];  
        for (int i=0; i < MAX ; i++ ) 
            isPrime[i] = 1; 
  
        // 0 and 1 are not primes  
        isPrime[0] = isPrime[1] = 0;  
        for (int i = 2; i * i < MAX; i++) {  
      
            // If i is prime  
            if (isPrime[i] == 1) {  
      
                // Set all multiples of i as non-prime  
                for (int j = i * 2; j < MAX; j += i)  
                    isPrime[j] = 0;  
            }  
        }  
      
        // Compute primeUpto array  
        for (int i = 1; i < MAX; i++) {  
            primeUpto[i] = primeUpto[i - 1];  
            if (isPrime[i] == 1)  
                primeUpto[i]++;  
        }  
    }  
      
    // Function to return the count  
    // of valid numbers  
    static int countOfNumbers(int N, int K)  
    {  
      
        // Compute primeUpto array  
        SieveOfEratosthenes();  
        int low = 1, high = N, ans = 0;  
        while (low <= high) {  
            int mid = (low + high) >> 1;  
      
            // Check if the number is  
            // valid, try to reduce it  
            if (mid - primeUpto[mid] >= K) {  
                ans = mid;  
                high = mid - 1;  
            }  
            else
                low = mid + 1;  
        }  
      
        ans = ans != 0 ? N - ans + 1 : 0 ; 
        // ans is the minimum valid number  
        return ans ;  
    }  
      
    // Driver Code  
     public static void main(String []args)  
    {  
        int N = 10, K = 3;  
        System.out.println(countOfNumbers(N, K)) ; 
    }  
    // This code is contributed by Ryuga 
} 

