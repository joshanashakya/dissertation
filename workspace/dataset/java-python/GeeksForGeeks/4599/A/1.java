

// Java implementation of above approach 
  
public class GFG { 
  
    // Function that finds the Nth 
    // element of K-Fibonacci series 
    static void solve(int N, int K) 
    { 
        int Array[] = new int[N + 1]; 
          
  
        // If N is less than K 
        // then the element is '1' 
        if (N <= K) { 
            System.out.println("1") ; 
            return; 
        } 
  
        int i = 0 ;  
        int sum = K; 
  
        // first k elements are 1 
        for (i = 1; i <= K; ++i) { 
            Array[i] = 1; 
        } 
  
        // (K+1)th element is K 
        Array[i] = sum; 
  
        // find the elements of the 
        // K-Fibonacci series 
        for (i = K + 2; i <= N; ++i) { 
  
            // subtract the element at index i-k-1 
            // and add the element at index i-i 
            // from the sum (sum contains the sum 
            // of previous 'K' elements ) 
            Array[i] = sum - Array[i - K - 1] + Array[i - 1]; 
  
            // set the new sum 
            sum = Array[i]; 
        } 
        System.out.println(Array[N]); 
    } 
  
    public static void main(String args[]) 
    { 
          int N = 4, K = 2; 
  
            // get the Nth value 
            // of K-Fibonacci series 
            solve(N, K); 
  
    } 
    // This code is contributed by ANKITRAI1 
} 

