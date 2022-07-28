

// Java implementation of the above approach  
class GFG { 
      
    static final int MAX = 1000;  
      
    // max_prime[i] represents maximum prime  
    // number that divides the number i  
    static int max_prime[] = new int[MAX];  
      
    // min_prime[i] represents minimum prime  
    // number that divides the number i  
    static int min_prime[] = new int[MAX];  
      
    // Function to store the minimum  
    // prime factor and the maximum  
    // prime factor in two arrays  
    static void sieve(int n)  
    {  
        for (int i = 2; i < n; ++i) {  
      
            // Check for prime number  
            // if min_prime[i] > 0,  
            // then it is not a prime number  
            if (min_prime[i] > 0) {  
                continue;  
            }  
      
            // If i is a prime number,  
            // then both minimum and maximum  
            // prime numbers that divide  
            // the number is the number itself  
            min_prime[i] = i;  
            max_prime[i] = i;  
      
            int j = i + i;  
      
            while (j < n) {  
                if (min_prime[j] == 0) {  
      
                    // If this number is being visited  
                    // for first time then this divisor  
                    // must be the smallest prime number  
                    // that divides this number  
                    min_prime[j] = i;  
                }  
      
                // Update prime number till the last  
                // prime number that divides this number  
      
                // The last prime number that  
                // divides this number will be maximum.  
                max_prime[j] = i;  
                j += i;  
            }  
        }  
    }  
      
    // Function to minimize the cost of finding  
    // two numbers for every number such that  
    // the product of those two is equal to X  
    static int findCost(int A, int B, int C, int X)  
    {  
        // Pre-calculation  
        sieve(MAX);  
      
        int N, M;  
      
        // If X == 1, then there is no way to  
        // find N and M. Print -1  
        if (X == 1) {  
            return -1;  
        }  
      
        // Case 3 is always valid and cost for that  
        // is C + X C for choosing 1 and M = X/1  
        int min_cost = C + X;  
      
        // Case 1  
        // N is prime, first number cost is fixed  
        // N is max_prime number divides this number  
        int cost_for_prime = A;  
        N = max_prime[X];  
      
        // If X is prime then the maximum prime number  
        // is the number itself. For this case,  
        // M becomes 1 and this shouldn't be considered.  
        if (N != X) {  
      
            // Find M for this case  
            M = X / N;  
      
            // Add cost for the second number also  
            cost_for_prime += M;  
      
            // Update min_cost, if the  
            // cost for prime is minimum  
            min_cost = Math.min(min_cost, cost_for_prime);  
        }  
      
        // Case 2  
        // If N is composite  
        // For this find the minimum prime number  
        // that divides A[i] and consider this as M  
        M = min_prime[X];  
      
        // Find N for that number  
        N = X / M;  
      
        // Check if this number is composite or not  
        // if N is prime then there is no way  
        // to find any composite number that divides X  
        // If N = min_prime[N] then N is prime  
        if (N != min_prime[N]) {  
            int cost_for_comp = B + M;  
      
            // Update min_cost, if the  
            // cost for the composite is minimum  
            min_cost = Math.min(min_cost, cost_for_comp);  
        }  
      
        return min_cost;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int A = 7, B = 11, C = 2, X = 20;  
      
        System.out.println(findCost(A, B, C, X));  
    }  
  
} 
  
// This code is contributed by AnkitRai01 

