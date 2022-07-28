

// Java implementation to Check if a  
// number can be expressed as a  
// product of exactly K prime divisors  
class GFG { 
      
    // function to find K prime divisors  
    static void KPrimeDivisors(int N, int K)  
    {  
        int maximum_split = 0;  
      
        // count number of 2s that divide N  
        while (N % 2 == 0) {  
            maximum_split++;  
            N /= 2;  
        }  
      
        // N must be odd at this point.  
        // So we can skip one element  
        for (int i = 3; i * i <= N; i = i + 2) {  
      
            while (N % i == 0) {  
                // divide the value of N  
                N = N / i;  
      
                // increment count  
                maximum_split++;  
            }  
        }  
      
        // Condition to handle the case when n  
        // is a prime number greater than 2  
        if (N > 2)  
            maximum_split++;  
      
        // check if maximum_split is less than K  
        // then it not possible  
        if (maximum_split < K) {  
            System.out.println("No");  
            return;  
        }  
      
        System.out.println("Yes");  
    }  
      
    /* Driver code */
    public static void main (String[] args) 
    {  
        // initialise N and K  
        int N = 12;  
        int K = 3;  
      
        KPrimeDivisors(N, K);  
    }  
} 
  
// This code is contributed by Yash_R 

